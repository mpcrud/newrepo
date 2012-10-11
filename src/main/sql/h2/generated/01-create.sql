--
-- (c) Copyright 2005-2012 JAXIO, www.jaxio.com
-- Source code generated by Celerio, a Jaxio product
-- Want to use Celerio within your company? email us at info@jaxio.com
-- Follow us on twitter: @springfuse
-- Template pack-backend-jpa:src/main/sql/h2/01-create.p.vm.sql
--
DROP ALL objects;

CREATE TABLE auth_group (
	id INTEGER(10) not null
	,name VARCHAR(80) not null
);
CREATE UNIQUE INDEX IF NOT EXISTS name
	ON auth_group (name);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON auth_group (id);
ALTER TABLE auth_group ALTER COLUMN id IDENTITY;

CREATE TABLE auth_group_permissions (
	id INTEGER(10) not null
	,group_id INTEGER(10) not null
	,permission_id INTEGER(10) not null
);
CREATE UNIQUE INDEX IF NOT EXISTS group_id
	ON auth_group_permissions (group_id,permission_id);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON auth_group_permissions (id);
ALTER TABLE auth_group_permissions ALTER COLUMN id IDENTITY;

CREATE TABLE auth_message (
	id INTEGER(10) not null
	,user_id INTEGER(10) not null
	,message LONGVARCHAR(2147483647) not null
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON auth_message (id);
ALTER TABLE auth_message ALTER COLUMN id IDENTITY;

CREATE TABLE auth_permission (
	id INTEGER(10) not null
	,name VARCHAR(50) not null
	,content_type_id INTEGER(10) not null
	,codename VARCHAR(100) not null
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON auth_permission (id);
CREATE UNIQUE INDEX IF NOT EXISTS content_type_id
	ON auth_permission (content_type_id,codename);
ALTER TABLE auth_permission ALTER COLUMN id IDENTITY;

CREATE TABLE auth_user (
	id INTEGER(10) not null
	,username VARCHAR(30) not null
	,first_name VARCHAR(30) not null
	,last_name VARCHAR(30) not null
	,email VARCHAR(75) not null
	,password VARCHAR(128) not null
	,is_staff BIT not null
	,is_active BIT not null
	,is_superuser BIT not null
	,last_login TIMESTAMP not null
	,date_joined TIMESTAMP not null
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON auth_user (id);
CREATE UNIQUE INDEX IF NOT EXISTS username
	ON auth_user (username);
ALTER TABLE auth_user ALTER COLUMN id IDENTITY;

CREATE TABLE auth_user_groups (
	id INTEGER(10) not null
	,user_id INTEGER(10) not null
	,group_id INTEGER(10) not null
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON auth_user_groups (id);
CREATE UNIQUE INDEX IF NOT EXISTS user_id
	ON auth_user_groups (user_id,group_id);
ALTER TABLE auth_user_groups ALTER COLUMN id IDENTITY;

CREATE TABLE auth_user_user_permissions (
	id INTEGER(10) not null
	,user_id INTEGER(10) not null
	,permission_id INTEGER(10) not null
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON auth_user_user_permissions (id);
CREATE UNIQUE INDEX IF NOT EXISTS user_id
	ON auth_user_user_permissions (user_id,permission_id);
ALTER TABLE auth_user_user_permissions ALTER COLUMN id IDENTITY;

CREATE TABLE django_admin_log (
	id INTEGER(10) not null
	,action_time TIMESTAMP not null
	,user_id INTEGER(10) not null
	,content_type_id INTEGER(10)
	,object_id LONGVARCHAR(2147483647)
	,object_repr VARCHAR(200) not null
	,action_flag SMALLINT(5) not null
	,change_message LONGVARCHAR(2147483647) not null
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON django_admin_log (id);
ALTER TABLE django_admin_log ALTER COLUMN id IDENTITY;

CREATE TABLE django_content_type (
	id INTEGER(10) not null
	,name VARCHAR(100) not null
	,app_label VARCHAR(100) not null
	,model VARCHAR(100) not null
);
CREATE UNIQUE INDEX IF NOT EXISTS app_label
	ON django_content_type (app_label,model);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON django_content_type (id);
ALTER TABLE django_content_type ALTER COLUMN id IDENTITY;

CREATE TABLE django_session (
	session_key VARCHAR(40) not null
	,session_data LONGVARCHAR(2147483647) not null
	,expire_date TIMESTAMP not null
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON django_session (session_key);
CREATE PRIMARY KEY 
	ON django_session (session_key);

CREATE TABLE django_site (
	id INTEGER(10) not null
	,domain VARCHAR(100) not null
	,name VARCHAR(50) not null
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON django_site (id);
ALTER TABLE django_site ALTER COLUMN id IDENTITY;

CREATE TABLE td_change_password (
	guid_char CHAR(36) not null
	,userId INTEGER(10) not null
	,creation_date TIMESTAMP not null
	,is_active SMALLINT(5) not null
	,guid_int INTEGER(10) not null
);
CREATE INDEX IF NOT EXISTS FK_td_user_id
	ON td_change_password (userId);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_change_password (guid_int);
ALTER TABLE td_change_password ALTER COLUMN guid_int IDENTITY;

CREATE TABLE td_city (
	city_id INTEGER(10) not null
	,city_name VARCHAR(45)
	,city_name2 VARCHAR(45)
	,population_rank SMALLINT(5)
	,destination_rank SMALLINT(5)
	,flag INTEGER(10)
	,destination_type SMALLINT(5)
	,is_bigcity CHAR(1)
	,is_destination CHAR(1)
	,importance SMALLINT(5)
	,metro_id INTEGER(10)
	,desc_short VARCHAR(2048)
	,desc_long LONGVARCHAR(65535)
	,is_resource TINYINT(3)
	,resources VARCHAR(1024)
	,is_supported_by SMALLINT(5)
	,longitude VARCHAR(10)
	,latitude VARCHAR(10)
	,customtable1 TINYINT(3)
	,customtable2 TINYINT(3)
	,customtable3 TINYINT(3)
	,customtable4 TINYINT(3)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_city (city_id);
ALTER TABLE td_city ALTER COLUMN city_id IDENTITY;

CREATE TABLE td_comment (
	comment_id INTEGER(10) not null
	,topic_id INTEGER(10)
	,comment_name VARCHAR(45)
	,comment_count INTEGER(10)
	,user_id INTEGER(10)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
	,is_active SMALLINT(5)
	,comment_desc VARCHAR(10000)
	,comment_status SMALLINT(5)
	,short_desc VARCHAR(500)
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_comment (comment_id);
CREATE INDEX IF NOT EXISTS fk_topic_comments_topic_id
	ON td_comment (topic_id);
CREATE INDEX IF NOT EXISTS fk_commments_user_id
	ON td_comment (user_id);
ALTER TABLE td_comment ALTER COLUMN comment_id IDENTITY;

CREATE TABLE td_country (
	country_id INTEGER(10) not null
	,country_name VARCHAR(255)
	,importance SMALLINT(5)
	,country_code INTEGER(10)
	,country_code2 INTEGER(10)
	,isd_code SMALLINT(5)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_country (country_id);
ALTER TABLE td_country ALTER COLUMN country_id IDENTITY;

CREATE TABLE td_make (
	make_id INTEGER(10)
	,make_display_name VARCHAR(768)
	,make_technical_name VARCHAR(768)
	,make_alternate_name VARCHAR(768)
	,short_desc VARCHAR(6144)
	,long_desc LONGVARBINARY(65535)
	,is_active SMALLINT(5)
	,starting_year_ops SMALLINT(5)
	,represent_country_id INTEGER(10)
	,custom1 VARCHAR(3072)
	,custom2 VARCHAR(3072)
	,custom3 VARCHAR(3072)
	,make_status TINYINT(3)
	,seo_resources VARCHAR(768)
	,seo_url VARCHAR(1536)
	,seo_h1 VARCHAR(768)
	,seo_h2 VARCHAR(768)
	,meta_title VARCHAR(1536)
	,meta_keyword VARCHAR(1536)
	,meta_description VARCHAR(1536)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
);

CREATE TABLE td_make_model (
	make_model_id INTEGER(10)
	,make_id INTEGER(10)
	,makemodel_display_name VARCHAR(768)
	,makemodel_technical_name VARCHAR(768)
	,makemodel_alternate_name VARCHAR(768)
	,short_desc VARCHAR(6144)
	,long_desc LONGVARBINARY(65535)
	,is_active SMALLINT(5)
	,model_launch_year SMALLINT(5)
	,fuel_type SMALLINT(5)
	,transmission_type SMALLINT(5)
	,wheeldrive_type SMALLINT(5)
	,engine_capacity SMALLINT(5)
	,body_type SMALLINT(5)
	,door_count SMALLINT(5)
	,gear_count SMALLINT(5)
	,fuel_delivery SMALLINT(5)
	,valves_count SMALLINT(5)
	,bhp SMALLINT(5)
	,torque SMALLINT(5)
	,makemodel_status TINYINT(3)
	,seo_resources VARCHAR(768)
	,seo_url VARCHAR(1536)
	,seo_h1 VARCHAR(768)
	,seo_h2 VARCHAR(768)
	,meta_title VARCHAR(1536)
	,meta_keyword VARCHAR(1536)
	,meta_description VARCHAR(1536)
	,custom1 VARCHAR(3072)
	,custom2 VARCHAR(3072)
	,custom3 VARCHAR(3072)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
);

CREATE TABLE td_make_submodel (
	make_submodel_id DOUBLE(22)
	,make_model_id DOUBLE(22)
	,makesubmodel_display_name VARCHAR(768)
	,makesubmodel_technical_name VARCHAR(768)
	,makesubmodel_alternate_name VARCHAR(768)
	,short_desc VARCHAR(6144)
	,long_desc LONGVARBINARY(65535)
	,submodel_launch_year INTEGER(10)
	,fuel_type INTEGER(10)
	,transmission_type INTEGER(10)
	,wheeldrive_type INTEGER(10)
	,engine_capacity INTEGER(10)
	,body_type INTEGER(10)
	,door_count INTEGER(10)
	,gear_count INTEGER(10)
	,fuel_delivery INTEGER(10)
	,valves_count INTEGER(10)
	,is_active INTEGER(10)
	,bhp INTEGER(10)
	,torque INTEGER(10)
	,submodel_type INTEGER(10)
	,special_edition_name VARCHAR(768)
	,special_edition_info VARCHAR(768)
	,special_edition_year INTEGER(10)
	,makesubmodel_status TINYINT(3)
	,seo_resources VARCHAR(768)
	,seo_url VARCHAR(1536)
	,seo_h1 VARCHAR(768)
	,seo_h2 VARCHAR(768)
	,meta_title VARCHAR(1536)
	,meta_keyword VARCHAR(1536)
	,meta_description VARCHAR(1536)
	,custom1 VARCHAR(3072)
	,custom2 VARCHAR(3072)
	,custom3 VARCHAR(3072)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
);

CREATE TABLE td_metro (
	metro_id INTEGER(10) not null
	,metro_name VARCHAR(45)
	,metro_name_2 VARCHAR(45)
	,metro_name_3 VARCHAR(45)
	,importance SMALLINT(5)
	,flag SMALLINT(5)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_metro (metro_id);
ALTER TABLE td_metro ALTER COLUMN metro_id IDENTITY;

CREATE TABLE td_order (
	order_id INTEGER(10) not null
	,billing_id INTEGER(10)
	,invoice_id INTEGER(10)
	,user_id INTEGER(10)
	,username VARCHAR(256)
	,order_form_no VARCHAR(128)
	,order_type SMALLINT(5) not null
	,order_status SMALLINT(5) not null
	,order_active TINYINT(3) not null default 1
	,order_change_history VARCHAR(4096)
	,order_priority SMALLINT(5)
	,order_corporate_type SMALLINT(5)
	,order_bulk_type SMALLINT(5)
	,order_discount_coupon_code VARCHAR(128)
	,product_id INTEGER(10) not null
	,product_name VARCHAR(256)
	,product_quantity SMALLINT(5) not null default 1
	,assigned_to_userid INTEGER(10)
	,assigned_to_userid_date TIMESTAMP
	,billing_phone1_blocked TINYINT(3) default 0
	,billing_phone2_blocked TINYINT(3) default 0
	,billing_firstname VARCHAR(127)
	,billing_lastname VARCHAR(127)
	,billing_email VARCHAR(256)
	,billing_phone1 VARCHAR(50)
	,billing_phone2 VARCHAR(50)
	,billing_addressline1 VARCHAR(255)
	,billing_addressline2 VARCHAR(255)
	,billing_city_id INTEGER(10)
	,billing_zip VARCHAR(64)
	,billing_state_id INTEGER(10)
	,billing_country_id INTEGER(10)
	,billing_total_amount REAL(12)
	,billing_advance_amount REAL(12)
	,billing_balance_amount REAL(12)
	,billing_margin_amount REAL(12)
	,billing_taxrate REAL(12)
	,billing_payment_gateway_rate REAL(12)
	,shipment_rate REAL(12)
	,billing_gross_amount REAL(12)
	,billing_nett_cost REAL(12)
	,cust_payment_mode SMALLINT(5)
	,cust_payment_status SMALLINT(5)
	,cust_payment_date TIMESTAMP
	,cust_payment_comments VARCHAR(256)
	,cust_payment_id1 VARCHAR(128)
	,cust_payment_id2 VARCHAR(128)
	,vendor_payment_mode SMALLINT(5)
	,vendor_payment_date TIMESTAMP
	,vendor_payment_comments VARCHAR(256)
	,shipment_firstname VARCHAR(127)
	,shipment_lastname VARCHAR(127)
	,shipment_email VARCHAR(256)
	,shipment_phone1 VARCHAR(50)
	,shipment_phone2 VARCHAR(50)
	,shipment_addressline1 VARCHAR(255)
	,shipment_addressline2 VARCHAR(255)
	,shipment_city_id INTEGER(10)
	,shipment_zip VARCHAR(64)
	,shipment_state_id INTEGER(10)
	,shipment_country_id INTEGER(10)
	,shipment_comments VARCHAR(512)
	,order_origin_ipaddress VARCHAR(256)
	,order_origin_city VARCHAR(256)
	,order_origin_country_code CHAR(2)
	,order_origin_country_id INTEGER(10)
	,order_leadsubmit_url VARCHAR(256)
	,order_origin_ref_url VARCHAR(256)
	,order_original_ref_url VARCHAR(256)
	,order_browsing_history VARCHAR(1024)
	,order_ref_keywords VARCHAR(512)
	,order_ref_source_id1 VARCHAR(64)
	,order_ref_source_id2 VARCHAR(64)
	,order_ref_cid VARCHAR(64)
	,order_creation_date TIMESTAMP not null
	,order_first_updation_date TIMESTAMP
	,order_availability_status TINYINT(3) default 1
	,order_availability_status_updation_date TIMESTAMP
	,dispatch_airway_id VARCHAR(128)
	,dispatch_date TIMESTAMP
	,delivery_date TIMESTAMP
	,delivery_status TINYINT(3) not null default 1
	,mailed_reminder_to_vendor_status TINYINT(3) default 0
	,mailed_reminder_to_vendor_date TIMESTAMP
	,order_cancel_request_status TINYINT(3) default 0
	,order_cancel_request_date TIMESTAMP
	,order_cancellation_to_vendor_status TINYINT(3) default 0
	,order_cancellation_to_vendor_date TIMESTAMP
	,order_conversion_date TIMESTAMP
	,order_confirmation_date TIMESTAMP
	,order_confirmation_comments VARCHAR(256)
	,order_reconfirmation_date TIMESTAMP
	,order_reconfirmation_comments VARCHAR(256)
	,order_cancellation_type SMALLINT(5)
	,order_cancellation_comments VARCHAR(256)
	,order_cancellation_date TIMESTAMP
	,order_refund_type SMALLINT(5)
	,order_refund_comments VARCHAR(256)
	,order_refund_date TIMESTAMP
	,dispute_raised_status TINYINT(3) default 0
	,dispute_raised_date TIMESTAMP
	,dispute_raised_comments VARCHAR(2096)
	,order_last_updation_date TIMESTAMP
	,order_accept_newsletter TINYINT(3) default 1
	,order_accept_promotional_material TINYINT(3) default 1
	,order_internal_narration VARCHAR(2048)
	,custom1 VARCHAR(128)
	,custom2 VARCHAR(128)
	,customint1 INTEGER(10)
	,customint2 INTEGER(10)
	,ipaddress VARCHAR(256)
	,car_make VARCHAR(256)
	,car_model VARCHAR(256)
	,car_year SMALLINT(5)
	,fuel_type VARCHAR(256)
	,order_origin_region VARCHAR(256)
);
CREATE INDEX IF NOT EXISTS fk_billing_city
	ON td_order (billing_city_id);
CREATE INDEX IF NOT EXISTS fk_shipment_city
	ON td_order (shipment_city_id);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_order (order_id);
CREATE INDEX IF NOT EXISTS fk_shipment_state
	ON td_order (shipment_state_id);
CREATE INDEX IF NOT EXISTS fk_order_user
	ON td_order (user_id);
CREATE INDEX IF NOT EXISTS fk_order_product
	ON td_order (product_id);
CREATE INDEX IF NOT EXISTS fk_billing_country
	ON td_order (billing_country_id);
CREATE INDEX IF NOT EXISTS fk_shipment_country
	ON td_order (shipment_country_id);
CREATE INDEX IF NOT EXISTS fk_order_assigned_to_user
	ON td_order (assigned_to_userid);
CREATE INDEX IF NOT EXISTS fk_billing_state
	ON td_order (billing_state_id);
ALTER TABLE td_order ALTER COLUMN order_id IDENTITY;

CREATE TABLE td_page (
	page_heading VARCHAR(256)
	,page_short_desc VARCHAR(1024)
	,page_long_desc VARCHAR(8096)
	,page_type TINYINT(3)
	,page_reference_id INTEGER(10)
	,page_id INTEGER(10) not null
	,page_seo_url VARCHAR(256)
	,page_seo_keyword VARCHAR(256)
	,page_seo_meta_desc VARCHAR(256)
	,page_seo_title VARCHAR(256)
	,page_h1 VARCHAR(256)
	,page_h2 VARCHAR(256)
	,page_back_link1 VARCHAR(256)
	,page_back_link2 VARCHAR(256)
	,page_is_active TINYINT(3)
	,page_priority TINYINT(3)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
	,page_user_id INTEGER(10)
	,page_custom1 VARCHAR(256)
	,page_custom2 VARCHAR(256)
	,page_custom3 INTEGER(10)
	,page_custom4 INTEGER(10)
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_page (page_id);
ALTER TABLE td_page ALTER COLUMN page_id IDENTITY;

CREATE TABLE td_permission (
	permission_id INTEGER(10) not null
	,permission_name VARCHAR(90)
	,creation_date TIMESTAMP not null
	,updation_date TIMESTAMP not null
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_permission (permission_id);
ALTER TABLE td_permission ALTER COLUMN permission_id IDENTITY;

CREATE TABLE td_picture (
	picture_id INTEGER(10) not null
	,picture_name VARCHAR(48) not null
	,picture_short_desc VARCHAR(1024)
	,picture_long_desc VARCHAR(4098)
	,picture_path VARCHAR(1024)
	,picture_url VARCHAR(512)
	,picture_owner VARCHAR(512)
	,picture_type SMALLINT(5) not null
	,picture_ref_id INTEGER(10) not null
	,status TINYINT(3) not null default 1
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_picture (picture_id);
ALTER TABLE td_picture ALTER COLUMN picture_id IDENTITY;

CREATE TABLE td_product (
	product_id INTEGER(10) not null
	,product_supplier_id INTEGER(10) not null
	,product_shipment_id INTEGER(10) not null
	,supplier_product_code VARCHAR(128)
	,product_display_name VARCHAR(256) not null
	,product_technical_name VARCHAR(256)
	,product_alternate_name VARCHAR(256)
	,micro_description VARCHAR(128)
	,short_desc VARCHAR(1024)
	,long_desc VARCHAR(4096)
	,product_age_time SMALLINT(5)
	,product_age_distance SMALLINT(5)
	,product_measurement_unit VARCHAR(128)
	,inner_dia1 INTEGER(10)
	,inner_dia2 INTEGER(10)
	,outer_dia1 INTEGER(10)
	,outer_dia2 INTEGER(10)
	,height1 INTEGER(10)
	,height2 INTEGER(10)
	,width1 INTEGER(10)
	,width2 INTEGER(10)
	,thickness1 INTEGER(10)
	,thickness2 INTEGER(10)
	,no_of_outer_thread1 INTEGER(10)
	,no_of_outer_thread2 INTEGER(10)
	,no_of_holes1 INTEGER(10)
	,no_of_holes2 INTEGER(10)
	,no_of_teeth1 INTEGER(10)
	,no_of_teeth2 INTEGER(10)
	,pitch_circle VARCHAR(256)
	,plate_diameter INTEGER(10)
	,engine_version VARCHAR(256)
	,material VARCHAR(256)
	,dimensions VARCHAR(512)
	,max_freeplay VARCHAR(128)
	,max_rock VARCHAR(128)
	,wear_warning VARCHAR(128)
	,brake_system_type VARCHAR(128)
	,friction_control_plate VARCHAR(128)
	,adjustment VARCHAR(256)
	,application_information VARCHAR(256)
	,fitting_position VARCHAR(256)
	,quantity_of_fit SMALLINT(5)
	,required_quantity SMALLINT(5)
	,supplementary_info VARCHAR(256)
	,extra_info VARCHAR(256)
	,custom_name1 VARCHAR(256)
	,custom_value1 VARCHAR(256)
	,custom_name2 VARCHAR(256)
	,custom_value2 VARCHAR(256)
	,custom_name3 VARCHAR(256)
	,custom_value3 VARCHAR(256)
	,custom_name4 VARCHAR(256)
	,custom_value4 VARCHAR(256)
	,mrp_price REAL(12) default 0
	,discount REAL(12) default 0
	,dealer_price REAL(12) default 0
	,internal_rating SMALLINT(5)
	,recommended_product BIT not null default '0'
	,best_seller BIT not null default '0'
	,specifications VARCHAR(1024)
	,ref_link1 VARCHAR(512)
	,ref_link2 VARCHAR(512)
	,product_segment_type INTEGER(10)
	,comparison VARCHAR(8192)
	,bookable_online BIT not null default '1'
	,bookable_offline BIT not null default '1'
	,uniform_across_year BIT not null default '0'
	,uniform_across_submodel BIT not null default '0'
	,uniform_across_model BIT not null default '0'
	,uniform_across_make BIT not null default '0'
	,delivery_type SMALLINT(5)
	,product_status BIT not null default '1'
	,customint1 INTEGER(10)
	,customint2 INTEGER(10)
	,customint3 INTEGER(10)
	,seo_resources VARCHAR(256)
	,seo_url VARCHAR(512)
	,seo_h1 VARCHAR(256)
	,seo_h2 VARCHAR(256)
	,meta_title VARCHAR(512)
	,meta_keyword VARCHAR(512)
	,meta_description VARCHAR(512)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
);
CREATE INDEX IF NOT EXISTS fk_product_brand_id
	ON td_product (product_supplier_id);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_product (product_id);
CREATE INDEX IF NOT EXISTS fk_product_product_shipment_id
	ON td_product (product_shipment_id);
ALTER TABLE td_product ALTER COLUMN product_id IDENTITY;

CREATE TABLE td_product_brand (
	product_brand_id INTEGER(10) not null
	,brand_display_name VARCHAR(256) not null
	,brand_alternate_name VARCHAR(256)
	,short_desc VARCHAR(1024)
	,long_desc VARCHAR(4096)
	,internal_rating SMALLINT(5)
	,ref_link1 VARCHAR(512)
	,ref_link2 VARCHAR(512)
	,brand_status BIT not null default '1'
	,custom1 VARCHAR(1024)
	,custom2 VARCHAR(1024)
	,custom3 VARCHAR(1024)
	,seo_resources VARCHAR(256)
	,seo_url VARCHAR(512)
	,seo_h1 VARCHAR(256)
	,seo_h2 VARCHAR(256)
	,meta_title VARCHAR(512)
	,meta_keyword VARCHAR(512)
	,meta_description VARCHAR(512)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
	,is_active SMALLINT(5)
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_product_brand (product_brand_id);
CREATE UNIQUE INDEX IF NOT EXISTS seo_url
	ON td_product_brand (seo_url);
ALTER TABLE td_product_brand ALTER COLUMN product_brand_id IDENTITY;

CREATE TABLE td_product_model (
	product_model_id INTEGER(10) not null
	,make_model_id INTEGER(10) not null
	,product_id INTEGER(10) not null
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_product_model (product_model_id);
ALTER TABLE td_product_model ALTER COLUMN product_model_id IDENTITY;

CREATE TABLE td_product_shipment (
	product_shipment_id INTEGER(10) not null
	,shipment_vendor_id INTEGER(10) not null
	,shipment_mrp_cost REAL(12) default 0
	,shipment_discount REAL(12) default 0
	,shipment_policy VARCHAR(1024)
	,shipment_special_note VARCHAR(512)
	,shipment_duration SMALLINT(5)
	,shipment_type SMALLINT(5)
	,shipment_status BIT not null default '1'
	,custom1 VARCHAR(1024)
	,custom2 VARCHAR(1024)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_product_shipment (product_shipment_id);
CREATE INDEX IF NOT EXISTS fk_product_shipment_vendor_id
	ON td_product_shipment (shipment_vendor_id);
ALTER TABLE td_product_shipment ALTER COLUMN product_shipment_id IDENTITY;

CREATE TABLE td_product_submodel (
	product_submodel_id INTEGER(10) not null
	,submodel_year_mapping_id INTEGER(10) not null
	,product_id INTEGER(10) not null
	,make_internal_product_code VARCHAR(128)
	,product_submodel_apply_location VARCHAR(512)
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_product_submodel (product_submodel_id);
CREATE INDEX IF NOT EXISTS fk_productmapping_make_submodel_id
	ON td_product_submodel (submodel_year_mapping_id);
ALTER TABLE td_product_submodel ALTER COLUMN product_submodel_id IDENTITY;

CREATE TABLE td_product_supplier (
	product_supplier_id INTEGER(10) not null
	,product_supplier_display_name VARCHAR(256) not null
	,product_supplier_alternate_name VARCHAR(256)
	,product_supplier_policy VARCHAR(1024)
	,product_supplier_specialization VARCHAR(512)
	,micro_description VARCHAR(128)
	,short_desc VARCHAR(1024)
	,long_desc VARCHAR(4096)
	,product_supplier_rating SMALLINT(5)
	,product_supplier_type SMALLINT(5)
	,product_supplier_logo_small VARCHAR(512)
	,product_supplier_logo_long VARCHAR(512)
	,product_supplier_status BIT not null default '1'
	,custom1 VARCHAR(1024)
	,custom2 VARCHAR(1024)
	,seo_resources VARCHAR(256)
	,seo_url VARCHAR(512)
	,seo_h1 VARCHAR(256)
	,seo_h2 VARCHAR(256)
	,meta_title VARCHAR(512)
	,meta_keyword VARCHAR(512)
	,meta_description VARCHAR(512)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_product_supplier (product_supplier_id);
ALTER TABLE td_product_supplier ALTER COLUMN product_supplier_id IDENTITY;

CREATE TABLE td_product_supplier_mapping (
	product_supplier_id INTEGER(10) not null
	,product_id INTEGER(10) not null
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_product_supplier_mapping (product_supplier_id,product_id);
CREATE INDEX IF NOT EXISTS fk_productsuppliermapping_supplier_id
	ON td_product_supplier_mapping (product_supplier_id);
CREATE INDEX IF NOT EXISTS fk_productsuppliermapping_product_id
	ON td_product_supplier_mapping (product_id);
CREATE PRIMARY KEY 
	ON td_product_supplier_mapping (product_id,product_supplier_id);

CREATE TABLE td_request_car_part (
	request_id INTEGER(10) not null
	,request_source VARCHAR(256)
	,creation_date TIMESTAMP
	,last_update_date TIMESTAMP
	,car_make VARCHAR(256)
	,car_model VARCHAR(256)
	,car_year SMALLINT(5)
	,fuel_type VARCHAR(256)
	,product_name VARCHAR(256)
	,billing_firstname VARCHAR(256)
	,billing_lastname VARCHAR(256)
	,billing_email VARCHAR(256)
	,billing_phone VARCHAR(50)
	,billing_addressline1 VARCHAR(255)
	,billing_addressline2 VARCHAR(255)
	,billing_city_id VARCHAR(255)
	,billing_state_id VARCHAR(255)
	,billing_country_id VARCHAR(255)
	,billing_zip VARCHAR(255)
	,request_status INTEGER(10)
	,request_comments VARCHAR(255)
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_request_car_part (request_id);
ALTER TABLE td_request_car_part ALTER COLUMN request_id IDENTITY;

CREATE TABLE td_role (
	role_id INTEGER(10) not null
	,role_name VARCHAR(45)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
	,is_active SMALLINT(5)
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_role (role_id);
ALTER TABLE td_role ALTER COLUMN role_id IDENTITY;

CREATE TABLE td_shipment_vendor (
	shipment_vendor_id INTEGER(10) not null
	,shipment_vendor_display_name VARCHAR(256) not null
	,shipment_vendor_alternate_name VARCHAR(256)
	,shipment_vendor_standard_mrp_cost REAL(12) default 0
	,shipment_vendor_standard_discount REAL(12) default 0
	,shipment_vendor_policy VARCHAR(1024)
	,shipment_vendor_special_note VARCHAR(512)
	,shipment_duration SMALLINT(5)
	,shipment_vendor_type SMALLINT(5)
	,shipment_vendor_status BIT not null default '1'
	,custom1 VARCHAR(1024)
	,custom2 VARCHAR(1024)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_shipment_vendor (shipment_vendor_id);
ALTER TABLE td_shipment_vendor ALTER COLUMN shipment_vendor_id IDENTITY;

CREATE TABLE td_state (
	state_id INTEGER(10) not null
	,state_name VARCHAR(512)
	,importance SMALLINT(5)
	,country_id INTEGER(10)
	,desc_short VARCHAR(255)
	,desc_long LONGVARCHAR(65535)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_state (state_id);
CREATE INDEX IF NOT EXISTS td_state_country_id
	ON td_state (country_id);
ALTER TABLE td_state ALTER COLUMN state_id IDENTITY;

CREATE TABLE td_submodel_year_mapping (
	submodel_year_mapping_id INTEGER(10)
	,make_submodel_id SMALLINT(5)
	,model_launch_year SMALLINT(5)
);

CREATE TABLE td_tag (
	tag_id INTEGER(10) not null
	,tag_title VARCHAR(45)
	,tag_priority INTEGER(10)
	,tag_type SMALLINT(5)
	,tag_desc VARCHAR(512)
	,tag_url VARCHAR(45)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
	,is_active SMALLINT(5)
	,tag_status SMALLINT(5)
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_tag (tag_id);
ALTER TABLE td_tag ALTER COLUMN tag_id IDENTITY;

CREATE TABLE td_tag_grp (
	tag_grp_id INTEGER(10) not null
	,reference_id INTEGER(10)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
	,is_active SMALLINT(5)
	,tag_grp_status SMALLINT(5)
	,reference_type SMALLINT(5)
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_tag_grp (tag_grp_id);
ALTER TABLE td_tag_grp ALTER COLUMN tag_grp_id IDENTITY;

CREATE TABLE td_tag_grp_tag_mapping (
	grp_tag_mapping_id INTEGER(10) not null
	,tag_grp_id INTEGER(10)
	,tag_id INTEGER(10)
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_tag_grp_tag_mapping (grp_tag_mapping_id);
ALTER TABLE td_tag_grp_tag_mapping ALTER COLUMN grp_tag_mapping_id IDENTITY;

CREATE TABLE td_tag_relation (
	tag_relation_id INTEGER(10) not null
	,current_tag_id INTEGER(10)
	,parent_tag_id INTEGER(10)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
	,tag_status SMALLINT(5)
	,is_active SMALLINT(5)
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_tag_relation (tag_relation_id);
CREATE INDEX IF NOT EXISTS td_tag_relation_tag_id_1
	ON td_tag_relation (parent_tag_id);
CREATE INDEX IF NOT EXISTS td_tag_relation_tag_id
	ON td_tag_relation (current_tag_id);
ALTER TABLE td_tag_relation ALTER COLUMN tag_relation_id IDENTITY;

CREATE TABLE td_topic (
	topic_id INTEGER(10) not null
	,topic_title VARCHAR(4096)
	,view_count INTEGER(10)
	,comment_count INTEGER(10)
	,assigned_since TIMESTAMP
	,desc_short VARCHAR(1024)
	,desc_long VARCHAR(4096)
	,user_id INTEGER(10)
	,parent_topic_id INTEGER(10)
	,twitter_count INTEGER(10)
	,facebook_count INTEGER(10)
	,meta_desc VARCHAR(200)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
	,is_active SMALLINT(5)
	,is_featured SMALLINT(5)
	,assigned_to_user INTEGER(10)
	,expiry_date TIMESTAMP
	,topic_status SMALLINT(5)
	,vote_count INTEGER(10)
	,custom_int_1 INTEGER(10)
	,custom_int_2 INTEGER(10)
	,custom_varchar_1 VARCHAR(45)
	,custom_varchar_2 VARCHAR(45)
	,seo_resources VARCHAR(256)
	,meta_title VARCHAR(512)
	,meta_keyword VARCHAR(4096)
	,seo_url VARCHAR(256)
	,h1 VARCHAR(256)
	,h2 VARCHAR(256)
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_topic (topic_id);
CREATE INDEX IF NOT EXISTS fk_auth_topic_user_id
	ON td_topic (user_id);
ALTER TABLE td_topic ALTER COLUMN topic_id IDENTITY;

CREATE TABLE td_user_activity (
	user_activity_id INTEGER(10) not null
	,user_id INTEGER(10)
	,user_logintime TIMESTAMP
	,duration INTEGER(10)
	,view_count INTEGER(10)
	,reply_count INTEGER(10)
	,ipaddress VARCHAR(8)
	,current_status SMALLINT(5)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
	,is_active SMALLINT(5)
	,session_page INTEGER(10)
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_user_activity (user_activity_id);
CREATE INDEX IF NOT EXISTS fk_activity_user_id
	ON td_user_activity (user_id);
ALTER TABLE td_user_activity ALTER COLUMN user_activity_id IDENTITY;

CREATE TABLE td_user_activity_event (
	user_activity_event_id INTEGER(10) not null
	,user_activity_id INTEGER(10)
	,user_activity_name VARCHAR(45)
	,user_event_name VARCHAR(45)
	,user_event_desc VARCHAR(300)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
);
CREATE INDEX IF NOT EXISTS fk_user_event_activity_id
	ON td_user_activity_event (user_activity_id);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_user_activity_event (user_activity_event_id);
ALTER TABLE td_user_activity_event ALTER COLUMN user_activity_event_id IDENTITY;

CREATE TABLE td_user_address (
	user_address_id INTEGER(10) not null
	,address_1 VARCHAR(90)
	,address_2 VARCHAR(90)
	,city_id INTEGER(10)
	,zip_code INTEGER(10)
	,country_id INTEGER(10)
	,state_id INTEGER(10)
	,user_details_id INTEGER(10)
	,metro_id INTEGER(10)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
	,is_active SMALLINT(5)
);
CREATE INDEX IF NOT EXISTS td_user_country_id
	ON td_user_address (country_id);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_user_address (user_address_id);
CREATE INDEX IF NOT EXISTS td_user_state_id
	ON td_user_address (state_id);
CREATE INDEX IF NOT EXISTS td_user_city_id
	ON td_user_address (city_id);
CREATE INDEX IF NOT EXISTS td_user_metro_id
	ON td_user_address (metro_id);
ALTER TABLE td_user_address ALTER COLUMN user_address_id IDENTITY;

CREATE TABLE td_user_auth (
	user_id INTEGER(10) not null
	,username VARCHAR(100) not null
	,email VARCHAR(100) not null
	,userpassword VARCHAR(100) not null
	,is_active SMALLINT(5)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
	,role_id INTEGER(10)
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_user_auth (user_id);
CREATE INDEX IF NOT EXISTS FK_td_user_auth_role_id
	ON td_user_auth (role_id);
ALTER TABLE td_user_auth ALTER COLUMN user_id IDENTITY;

CREATE TABLE td_user_detail (
	user_details_id INTEGER(10) not null
	,user_id INTEGER(10)
	,firstname VARCHAR(45)
	,lastname VARCHAR(45)
	,is_active SMALLINT(5)
	,dob DATE
	,phone INTEGER(10)
	,interest VARCHAR(45)
	,creation_date TIMESTAMP not null
	,updation_date TIMESTAMP
	,credit INTEGER(10)
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_user_detail (user_details_id);
CREATE INDEX IF NOT EXISTS fk_user_id
	ON td_user_detail (user_id);
ALTER TABLE td_user_detail ALTER COLUMN user_details_id IDENTITY;

CREATE TABLE td_user_tag_preference (
	user_tag_preference_id INTEGER(10) not null
	,user_id INTEGER(10)
	,tag_id INTEGER(10)
	,creation_date TIMESTAMP not null
	,updation_date TIMESTAMP not null
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_user_tag_preference (user_tag_preference_id);
CREATE INDEX IF NOT EXISTS fk_pref_user_id
	ON td_user_tag_preference (user_id);
CREATE INDEX IF NOT EXISTS fk_pref_tag_id
	ON td_user_tag_preference (tag_id);
ALTER TABLE td_user_tag_preference ALTER COLUMN user_tag_preference_id IDENTITY;

CREATE TABLE td_vote (
	vote_id INTEGER(10) not null
	,user_id INTEGER(10)
	,topic_id INTEGER(10)
	,vote_type SMALLINT(5)
	,creation_date TIMESTAMP
	,updation_date TIMESTAMP
	,is_active SMALLINT(5)
	,vote_status SMALLINT(5)
	,comment_id INTEGER(10)
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON td_vote (vote_id);
CREATE INDEX IF NOT EXISTS td_vote_user_id
	ON td_vote (user_id);
CREATE INDEX IF NOT EXISTS td_vote_topic_id
	ON td_vote (topic_id);
CREATE INDEX IF NOT EXISTS fk_td_vote_comment_id
	ON td_vote (comment_id);
ALTER TABLE td_vote ALTER COLUMN vote_id IDENTITY;

CREATE TABLE temp_td_submodel_year_mapping (
	submodel_year_mapping_id INTEGER(10) not null
	,make_submodel_id SMALLINT(5) not null
	,model_launch_year SMALLINT(5) not null
	,model_end_year SMALLINT(5) not null
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON temp_td_submodel_year_mapping (submodel_year_mapping_id);
ALTER TABLE temp_td_submodel_year_mapping ALTER COLUMN submodel_year_mapping_id IDENTITY;

CREATE TABLE temp_td_tag_grp_tag_mapping (
	tag_grp_id INTEGER(10) not null
	,tag_id INTEGER(10) not null
);
CREATE UNIQUE INDEX IF NOT EXISTS PRIMARY
	ON temp_td_tag_grp_tag_mapping (tag_grp_id,tag_id);
CREATE PRIMARY KEY 
	ON temp_td_tag_grp_tag_mapping (tag_grp_id,tag_id);


ALTER TABLE td_order 
	ADD CONSTRAINT FK_BILLING_CITY
		FOREIGN KEY (billing_city_id)
			REFERENCES td_city (city_id);
ALTER TABLE td_order 
	ADD CONSTRAINT FK_SHIPMENT_CITY
		FOREIGN KEY (shipment_city_id)
			REFERENCES td_city (city_id);
ALTER TABLE td_order 
	ADD CONSTRAINT FK_SHIPMENT_STATE
		FOREIGN KEY (shipment_state_id)
			REFERENCES td_state (state_id);
ALTER TABLE td_order 
	ADD CONSTRAINT FK_ORDER_USER
		FOREIGN KEY (user_id)
			REFERENCES td_user_auth (user_id);
ALTER TABLE td_order 
	ADD CONSTRAINT FK_ORDER_PRODUCT
		FOREIGN KEY (product_id)
			REFERENCES td_product (product_id);
ALTER TABLE td_order 
	ADD CONSTRAINT FK_BILLING_COUNTRY
		FOREIGN KEY (billing_country_id)
			REFERENCES td_country (country_id);
ALTER TABLE td_order 
	ADD CONSTRAINT FK_SHIPMENT_COUNTRY
		FOREIGN KEY (shipment_country_id)
			REFERENCES td_country (country_id);
ALTER TABLE td_order 
	ADD CONSTRAINT FK_ORDER_ASSIGNED_TO_USER
		FOREIGN KEY (assigned_to_userid)
			REFERENCES td_user_auth (user_id);
ALTER TABLE td_order 
	ADD CONSTRAINT FK_BILLING_STATE
		FOREIGN KEY (billing_state_id)
			REFERENCES td_state (state_id);
ALTER TABLE td_product_shipment 
	ADD CONSTRAINT FK_PRODUCT_SHIPMENT_VENDOR_ID
		FOREIGN KEY (shipment_vendor_id)
			REFERENCES td_shipment_vendor (shipment_vendor_id);
ALTER TABLE td_product_supplier_mapping 
	ADD CONSTRAINT FK_PRODUCTSUPPLIERMAPPING_SUPPLIER_ID
		FOREIGN KEY (product_supplier_id)
			REFERENCES td_product_supplier (product_supplier_id);
ALTER TABLE td_product_supplier_mapping 
	ADD CONSTRAINT FK_PRODUCTSUPPLIERMAPPING_PRODUCT_ID
		FOREIGN KEY (product_id)
			REFERENCES td_product (product_id);
ALTER TABLE td_state 
	ADD CONSTRAINT TD_STATE_COUNTRY_ID
		FOREIGN KEY (country_id)
			REFERENCES td_country (country_id);
ALTER TABLE td_tag_relation 
	ADD CONSTRAINT TD_TAG_RELATION_TAG_ID_1
		FOREIGN KEY (parent_tag_id)
			REFERENCES td_tag (tag_id);
ALTER TABLE td_tag_relation 
	ADD CONSTRAINT TD_TAG_RELATION_TAG_ID
		FOREIGN KEY (current_tag_id)
			REFERENCES td_tag (tag_id);
ALTER TABLE td_topic 
	ADD CONSTRAINT FK_AUTH_TOPIC_USER_ID
		FOREIGN KEY (user_id)
			REFERENCES td_user_auth (user_id);
ALTER TABLE td_user_activity 
	ADD CONSTRAINT FK_ACTIVITY_USER_ID
		FOREIGN KEY (user_id)
			REFERENCES td_user_auth (user_id);
ALTER TABLE td_user_activity_event 
	ADD CONSTRAINT FK_USER_EVENT_ACTIVITY_ID
		FOREIGN KEY (user_activity_id)
			REFERENCES td_user_activity (user_activity_id);
ALTER TABLE td_user_address 
	ADD CONSTRAINT TD_USER_COUNTRY_ID
		FOREIGN KEY (country_id)
			REFERENCES td_country (country_id);
ALTER TABLE td_user_address 
	ADD CONSTRAINT TD_USER_STATE_ID
		FOREIGN KEY (state_id)
			REFERENCES td_state (state_id);
ALTER TABLE td_user_address 
	ADD CONSTRAINT TD_USER_CITY_ID
		FOREIGN KEY (city_id)
			REFERENCES td_city (city_id);
ALTER TABLE td_user_address 
	ADD CONSTRAINT TD_USER_METRO_ID
		FOREIGN KEY (metro_id)
			REFERENCES td_metro (metro_id);
ALTER TABLE td_user_auth 
	ADD CONSTRAINT FK_TD_USER_AUTH_ROLE_ID
		FOREIGN KEY (role_id)
			REFERENCES td_role (role_id);
ALTER TABLE td_user_detail 
	ADD CONSTRAINT FK_USER_ID
		FOREIGN KEY (user_id)
			REFERENCES td_user_auth (user_id);
ALTER TABLE td_user_tag_preference 
	ADD CONSTRAINT FK_PREF_USER_ID
		FOREIGN KEY (user_id)
			REFERENCES td_user_auth (user_id);
ALTER TABLE td_user_tag_preference 
	ADD CONSTRAINT FK_PREF_TAG_ID
		FOREIGN KEY (tag_id)
			REFERENCES td_tag (tag_id);
ALTER TABLE td_vote 
	ADD CONSTRAINT TD_VOTE_USER_ID
		FOREIGN KEY (user_id)
			REFERENCES td_user_auth (user_id);
ALTER TABLE td_vote 
	ADD CONSTRAINT TD_VOTE_TOPIC_ID
		FOREIGN KEY (topic_id)
			REFERENCES td_topic (topic_id);
ALTER TABLE td_comment 
	ADD CONSTRAINT FK_COMMENT_TOPIC_ID
		FOREIGN KEY (topic_id)
			REFERENCES td_topic (topic_id);
ALTER TABLE td_comment 
	ADD CONSTRAINT FK_COMMENT_USER_ID
		FOREIGN KEY (user_id)
			REFERENCES td_user_auth (user_id);
ALTER TABLE td_make_model 
	ADD CONSTRAINT FK_MODEL_MAKE_ID
		FOREIGN KEY (make_id)
			REFERENCES td_make (make_id);
ALTER TABLE td_make_submodel 
	ADD CONSTRAINT FK_SUBMODEL_MODEL_ID
		FOREIGN KEY (make_model_id)
			REFERENCES td_make_model (make_model_id);
	
			
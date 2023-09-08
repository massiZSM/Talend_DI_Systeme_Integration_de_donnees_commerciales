#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Dtalend.component.manager.m2.repository=$ROOT_PATH/../lib -Xms256M -Xmx1024M -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/log4j-slf4j-impl-2.13.2.jar:$ROOT_PATH/../lib/log4j-api-2.13.2.jar:$ROOT_PATH/../lib/log4j-core-2.13.2.jar:$ROOT_PATH/../lib/log4j-1.2-api-2.13.2.jar:$ROOT_PATH/../lib/commons-collections-3.2.2.jar:$ROOT_PATH/../lib/jboss-marshalling-river-2.0.12.Final.jar:$ROOT_PATH/../lib/jboss-marshalling-2.0.12.Final.jar:$ROOT_PATH/../lib/talend_file_enhanced-1.1.jar:$ROOT_PATH/../lib/advancedPersistentLookupLib-1.3.jar:$ROOT_PATH/../lib/dom4j-2.1.3.jar:$ROOT_PATH/../lib/jakarta-oro-2.0.8.jar:$ROOT_PATH/../lib/slf4j-api-1.7.29.jar:$ROOT_PATH/../lib/trove.jar:$ROOT_PATH/../lib/postgresql-42.2.14.jar:$ROOT_PATH/../lib/talendcsv-1.0.0.jar:$ROOT_PATH/../lib/crypto-utils-0.31.12.jar:$ROOT_PATH/jchargeods_0_1.jar:$ROOT_PATH/jodssouscategorie_0_1.jar:$ROOT_PATH/jodsvente_0_1.jar:$ROOT_PATH/jodscategorie_0_1.jar:$ROOT_PATH/jodstypeclient_0_1.jar:$ROOT_PATH/jodsclient_0_1.jar:$ROOT_PATH/jodsproduit_0_1.jar: icommerce_reporting.jchargeods_0_1.jChargeODS --context=Default "$@"
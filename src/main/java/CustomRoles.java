import java.util.*;
import java.util.stream.Collectors;

public class CustomRoles {
    public static void main(String[] args) {
        String privilegedEngRolePerms = "permission { id = data.datadog_permissions.role.permissions.standard },permission { id = data.datadog_permissions.role.permissions.logs_read_index_data },permission { id = data.datadog_permissions.role.permissions.logs_modify_indexes },permission { id = data.datadog_permissions.role.permissions.logs_live_tail },permission { id = data.datadog_permissions.role.permissions.logs_write_exclusion_filters },permission { id = data.datadog_permissions.role.permissions.logs_write_pipelines },permission { id = data.datadog_permissions.role.permissions.logs_write_processors },permission { id = data.datadog_permissions.role.permissions.logs_write_archives },permission { id = data.datadog_permissions.role.permissions.logs_generate_metrics },permission { id = data.datadog_permissions.role.permissions.logs_delete_data },permission { id = data.datadog_permissions.role.permissions.dashboards_write },permission { id = data.datadog_permissions.role.permissions.dashboards_public_share },permission { id = data.datadog_permissions.role.permissions.monitors_write },permission { id = data.datadog_permissions.role.permissions.monitors_downtime },permission { id = data.datadog_permissions.role.permissions.logs_read_data },permission { id = data.datadog_permissions.role.permissions.logs_read_archives },permission { id = data.datadog_permissions.role.permissions.security_monitoring_rules_read },permission { id = data.datadog_permissions.role.permissions.security_monitoring_rules_write },permission { id = data.datadog_permissions.role.permissions.security_monitoring_signals_read },permission { id = data.datadog_permissions.role.permissions.security_monitoring_signals_write },permission { id = data.datadog_permissions.role.permissions.user_access_invite },permission { id = data.datadog_permissions.role.permissions.user_access_manage },permission { id = data.datadog_permissions.role.permissions.user_app_keys },permission { id = data.datadog_permissions.role.permissions.org_app_keys_read },permission { id = data.datadog_permissions.role.permissions.org_app_keys_write },permission { id = data.datadog_permissions.role.permissions.synthetics_private_location_read },permission { id = data.datadog_permissions.role.permissions.synthetics_private_location_write },permission { id = data.datadog_permissions.role.permissions.billing_read },permission { id = data.datadog_permissions.role.permissions.usage_read },permission { id = data.datadog_permissions.role.permissions.usage_edit },permission { id = data.datadog_permissions.role.permissions.metric_tags_write },permission { id = data.datadog_permissions.role.permissions.logs_write_historical_view },permission { id = data.datadog_permissions.role.permissions.audit_logs_read },permission { id = data.datadog_permissions.role.permissions.api_keys_read },permission { id = data.datadog_permissions.role.permissions.api_keys_write },permission { id = data.datadog_permissions.role.permissions.synthetics_global_variable_read },permission { id = data.datadog_permissions.role.permissions.synthetics_global_variable_write },permission { id = data.datadog_permissions.role.permissions.synthetics_read },permission { id = data.datadog_permissions.role.permissions.synthetics_write },permission { id = data.datadog_permissions.role.permissions.synthetics_default_settings_read },permission { id = data.datadog_permissions.role.permissions.synthetics_default_settings_write },permission { id = data.datadog_permissions.role.permissions.logs_write_facets },permission { id = data.datadog_permissions.role.permissions.service_account_write },permission { id = data.datadog_permissions.role.permissions.integrations_api },permission { id = data.datadog_permissions.role.permissions.apm_retention_filter_read },permission { id = data.datadog_permissions.role.permissions.apm_retention_filter_write },permission { id = data.datadog_permissions.role.permissions.apm_service_ingest_read },permission { id = data.datadog_permissions.role.permissions.apm_service_ingest_write },permission { id = data.datadog_permissions.role.permissions.apm_apdex_manage_write },permission { id = data.datadog_permissions.role.permissions.apm_tag_management_write },permission { id = data.datadog_permissions.role.permissions.apm_primary_operation_write },permission { id = data.datadog_permissions.role.permissions.audit_logs_write },permission { id = data.datadog_permissions.role.permissions.rum_apps_write },permission { id = data.datadog_permissions.role.permissions.data_scanner_read },permission { id = data.datadog_permissions.role.permissions.data_scanner_write },permission { id = data.datadog_permissions.role.permissions.security_monitoring_filters_read },permission { id = data.datadog_permissions.role.permissions.security_monitoring_filters_write },permission { id = data.datadog_permissions.role.permissions.incident_write },permission { id = data.datadog_permissions.role.permissions.incident_settings_read },permission { id = data.datadog_permissions.role.permissions.incident_settings_write },permission { id = data.datadog_permissions.role.permissions.appsec_event_rule_write },permission { id = data.datadog_permissions.role.permissions.rum_session_replay_read },permission { id = data.datadog_permissions.role.permissions.security_monitoring_notification_profiles_read },permission { id = data.datadog_permissions.role.permissions.security_monitoring_notification_profiles_write },permission { id = data.datadog_permissions.role.permissions.apm_generate_metrics },permission { id = data.datadog_permissions.role.permissions.apm_pipelines_write },permission { id = data.datadog_permissions.role.permissions.apm_pipelines_read },permission { id = data.datadog_permissions.role.permissions.notebooks_write },permission { id = data.datadog_permissions.role.permissions.generate_dashboard_reports },permission { id = data.datadog_permissions.role.permissions.slos_write },permission { id = data.datadog_permissions.role.permissions.slos_corrections },permission { id = data.datadog_permissions.role.permissions.apm_service_catalog_read },permission { id = data.datadog_permissions.role.permissions.apm_service_catalog_write },permission { id = data.datadog_permissions.role.permissions.connections_resolve },permission { id = data.datadog_permissions.role.permissions.connections_read },permission { id = data.datadog_permissions.role.permissions.connections_write },permission { id = data.datadog_permissions.role.permissions.workflows_read },permission { id = data.datadog_permissions.role.permissions.workflows_run },permission { id = data.datadog_permissions.role.permissions.workflows_write },permission { id = data.datadog_permissions.role.permissions.manage_integrations },permission { id = data.datadog_permissions.role.permissions.appsec_event_rule_read },permission { id = data.datadog_permissions.role.permissions.continuous_profiler_read },permission { id = data.datadog_permissions.role.permissions.usage_notifications_read },permission { id = data.datadog_permissions.role.permissions.observability_pipelines_read }";

        String standardRolPerms = "permission { id = data.datadog_permissions.role.permissions.standard },permission { id = data.datadog_permissions.role.permissions.logs_read_index_data },permission { id = data.datadog_permissions.role.permissions.logs_live_tail },permission { id = data.datadog_permissions.role.permissions.dashboards_write },permission { id = data.datadog_permissions.role.permissions.dashboards_public_share },permission { id = data.datadog_permissions.role.permissions.monitors_write },permission { id = data.datadog_permissions.role.permissions.monitors_downtime },permission { id = data.datadog_permissions.role.permissions.logs_read_data },permission { id = data.datadog_permissions.role.permissions.logs_read_archives },permission { id = data.datadog_permissions.role.permissions.security_monitoring_rules_read },permission { id = data.datadog_permissions.role.permissions.security_monitoring_signals_read },permission { id = data.datadog_permissions.role.permissions.user_app_keys },permission { id = data.datadog_permissions.role.permissions.synthetics_private_location_read },permission { id = data.datadog_permissions.role.permissions.logs_write_historical_view },permission { id = data.datadog_permissions.role.permissions.synthetics_global_variable_read },permission { id = data.datadog_permissions.role.permissions.synthetics_global_variable_write },permission { id = data.datadog_permissions.role.permissions.synthetics_read },permission { id = data.datadog_permissions.role.permissions.synthetics_write },permission { id = data.datadog_permissions.role.permissions.synthetics_default_settings_read },permission { id = data.datadog_permissions.role.permissions.synthetics_default_settings_write },permission { id = data.datadog_permissions.role.permissions.logs_write_facets },permission { id = data.datadog_permissions.role.permissions.apm_retention_filter_read },permission { id = data.datadog_permissions.role.permissions.apm_service_ingest_read },permission { id = data.datadog_permissions.role.permissions.apm_tag_management_write },permission { id = data.datadog_permissions.role.permissions.apm_primary_operation_write },permission { id = data.datadog_permissions.role.permissions.rum_apps_write },permission { id = data.datadog_permissions.role.permissions.security_monitoring_filters_read },permission { id = data.datadog_permissions.role.permissions.incident_write },permission { id = data.datadog_permissions.role.permissions.incident_settings_read },permission { id = data.datadog_permissions.role.permissions.incident_settings_write },permission { id = data.datadog_permissions.role.permissions.appsec_event_rule_write },permission { id = data.datadog_permissions.role.permissions.rum_session_replay_read },permission { id = data.datadog_permissions.role.permissions.security_monitoring_notification_profiles_read },permission { id = data.datadog_permissions.role.permissions.security_monitoring_notification_profiles_write },permission { id = data.datadog_permissions.role.permissions.apm_generate_metrics },permission { id = data.datadog_permissions.role.permissions.apm_pipelines_read },permission { id = data.datadog_permissions.role.permissions.notebooks_write },permission { id = data.datadog_permissions.role.permissions.slos_write },permission { id = data.datadog_permissions.role.permissions.slos_corrections },permission { id = data.datadog_permissions.role.permissions.usage_read },permission { id = data.datadog_permissions.role.permissions.usage_notifications_read },permission { id = data.datadog_permissions.role.permissions.observability_pipelines_read },permission { id = data.datadog_permissions.role.permissions.apm_service_catalog_read },permission { id = data.datadog_permissions.role.permissions.connections_resolve },permission { id = data.datadog_permissions.role.permissions.connections_read },permission { id = data.datadog_permissions.role.permissions.workflows_read },permission { id = data.datadog_permissions.role.permissions.workflows_run },permission { id = data.datadog_permissions.role.permissions.appsec_event_rule_read },permission { id = data.datadog_permissions.role.permissions.continuous_profiler_read }";

        Set<String> privEngPermsSet = Arrays.stream(privilegedEngRolePerms.split(",")).collect(Collectors.toSet());

        Set<String> standardRolPermsSet = Arrays.stream(standardRolPerms.split(",")).collect(Collectors.toSet());


        String adminMinus4Perms = "permission { id = data.datadog_permissions.role.permissions.standard },permission { id = data.datadog_permissions.role.permissions.logs_read_index_data },permission { id = data.datadog_permissions.role.permissions.logs_modify_indexes },permission { id = data.datadog_permissions.role.permissions.logs_live_tail },permission { id = data.datadog_permissions.role.permissions.logs_write_exclusion_filters },permission { id = data.datadog_permissions.role.permissions.logs_write_pipelines },permission { id = data.datadog_permissions.role.permissions.logs_write_processors },permission { id = data.datadog_permissions.role.permissions.logs_write_archives },permission { id = data.datadog_permissions.role.permissions.logs_generate_metrics },permission { id = data.datadog_permissions.role.permissions.logs_delete_data },permission { id = data.datadog_permissions.role.permissions.dashboards_write },permission { id = data.datadog_permissions.role.permissions.dashboards_public_share },permission { id = data.datadog_permissions.role.permissions.monitors_write },permission { id = data.datadog_permissions.role.permissions.monitors_downtime },permission { id = data.datadog_permissions.role.permissions.logs_read_data },permission { id = data.datadog_permissions.role.permissions.logs_read_archives },permission { id = data.datadog_permissions.role.permissions.security_monitoring_rules_read },permission { id = data.datadog_permissions.role.permissions.security_monitoring_rules_write },permission { id = data.datadog_permissions.role.permissions.security_monitoring_signals_read },permission { id = data.datadog_permissions.role.permissions.security_monitoring_signals_write },permission { id = data.datadog_permissions.role.permissions.user_access_invite },permission { id = data.datadog_permissions.role.permissions.user_app_keys },permission { id = data.datadog_permissions.role.permissions.org_app_keys_read },permission { id = data.datadog_permissions.role.permissions.org_app_keys_write },permission { id = data.datadog_permissions.role.permissions.synthetics_private_location_read },permission { id = data.datadog_permissions.role.permissions.synthetics_private_location_write },permission { id = data.datadog_permissions.role.permissions.billing_read },permission { id = data.datadog_permissions.role.permissions.usage_read },permission { id = data.datadog_permissions.role.permissions.usage_edit },permission { id = data.datadog_permissions.role.permissions.metric_tags_write },permission { id = data.datadog_permissions.role.permissions.logs_write_historical_view },permission { id = data.datadog_permissions.role.permissions.audit_logs_read },permission { id = data.datadog_permissions.role.permissions.api_keys_read },permission { id = data.datadog_permissions.role.permissions.api_keys_write },permission { id = data.datadog_permissions.role.permissions.synthetics_global_variable_read },permission { id = data.datadog_permissions.role.permissions.synthetics_global_variable_write },permission { id = data.datadog_permissions.role.permissions.synthetics_read },permission { id = data.datadog_permissions.role.permissions.synthetics_write },permission { id = data.datadog_permissions.role.permissions.synthetics_default_settings_read },permission { id = data.datadog_permissions.role.permissions.synthetics_default_settings_write },permission { id = data.datadog_permissions.role.permissions.logs_write_facets },permission { id = data.datadog_permissions.role.permissions.service_account_write },permission { id = data.datadog_permissions.role.permissions.integrations_api },permission { id = data.datadog_permissions.role.permissions.apm_retention_filter_read },permission { id = data.datadog_permissions.role.permissions.apm_retention_filter_write },permission { id = data.datadog_permissions.role.permissions.apm_service_ingest_read },permission { id = data.datadog_permissions.role.permissions.apm_service_ingest_write },permission { id = data.datadog_permissions.role.permissions.apm_apdex_manage_write },permission { id = data.datadog_permissions.role.permissions.apm_tag_management_write },permission { id = data.datadog_permissions.role.permissions.apm_primary_operation_write },permission { id = data.datadog_permissions.role.permissions.audit_logs_write },permission { id = data.datadog_permissions.role.permissions.rum_apps_write },permission { id = data.datadog_permissions.role.permissions.data_scanner_read },permission { id = data.datadog_permissions.role.permissions.data_scanner_write },permission { id = data.datadog_permissions.role.permissions.security_monitoring_filters_read },permission { id = data.datadog_permissions.role.permissions.security_monitoring_filters_write },permission { id = data.datadog_permissions.role.permissions.incident_write },permission { id = data.datadog_permissions.role.permissions.incident_settings_read },permission { id = data.datadog_permissions.role.permissions.incident_settings_write },permission { id = data.datadog_permissions.role.permissions.appsec_event_rule_write },permission { id = data.datadog_permissions.role.permissions.rum_session_replay_read },permission { id = data.datadog_permissions.role.permissions.security_monitoring_notification_profiles_read },permission { id = data.datadog_permissions.role.permissions.security_monitoring_notification_profiles_write },permission { id = data.datadog_permissions.role.permissions.apm_generate_metrics },permission { id = data.datadog_permissions.role.permissions.apm_pipelines_write },permission { id = data.datadog_permissions.role.permissions.apm_pipelines_read },permission { id = data.datadog_permissions.role.permissions.notebooks_write },permission { id = data.datadog_permissions.role.permissions.generate_dashboard_reports },permission { id = data.datadog_permissions.role.permissions.slos_write },permission { id = data.datadog_permissions.role.permissions.slos_corrections },permission { id = data.datadog_permissions.role.permissions.apm_service_catalog_read },permission { id = data.datadog_permissions.role.permissions.apm_service_catalog_write },permission { id = data.datadog_permissions.role.permissions.connections_resolve },permission { id = data.datadog_permissions.role.permissions.connections_read },permission { id = data.datadog_permissions.role.permissions.connections_write },permission { id = data.datadog_permissions.role.permissions.workflows_read },permission { id = data.datadog_permissions.role.permissions.workflows_run },permission { id = data.datadog_permissions.role.permissions.workflows_write },permission { id = data.datadog_permissions.role.permissions.manage_integrations },permission { id = data.datadog_permissions.role.permissions.appsec_event_rule_read },permission { id = data.datadog_permissions.role.permissions.continuous_profiler_read }";

        String stdPerms = "permission { id = data.datadog_permissions.role.permissions.standard },permission { id = data.datadog_permissions.role.permissions.logs_read_index_data },permission { id = data.datadog_permissions.role.permissions.logs_live_tail },permission { id = data.datadog_permissions.role.permissions.dashboards_write },permission { id = data.datadog_permissions.role.permissions.dashboards_public_share },permission { id = data.datadog_permissions.role.permissions.monitors_write },permission { id = data.datadog_permissions.role.permissions.monitors_downtime },permission { id = data.datadog_permissions.role.permissions.logs_read_data },permission { id = data.datadog_permissions.role.permissions.logs_read_archives },permission { id = data.datadog_permissions.role.permissions.security_monitoring_rules_read },permission { id = data.datadog_permissions.role.permissions.security_monitoring_signals_read },permission { id = data.datadog_permissions.role.permissions.user_app_keys },permission { id = data.datadog_permissions.role.permissions.synthetics_private_location_read },permission { id = data.datadog_permissions.role.permissions.logs_write_historical_view },permission { id = data.datadog_permissions.role.permissions.synthetics_global_variable_read },permission { id = data.datadog_permissions.role.permissions.synthetics_global_variable_write },permission { id = data.datadog_permissions.role.permissions.synthetics_read },permission { id = data.datadog_permissions.role.permissions.synthetics_write },permission { id = data.datadog_permissions.role.permissions.synthetics_default_settings_read },permission { id = data.datadog_permissions.role.permissions.synthetics_default_settings_write },permission { id = data.datadog_permissions.role.permissions.logs_write_facets },permission { id = data.datadog_permissions.role.permissions.apm_retention_filter_read },permission { id = data.datadog_permissions.role.permissions.apm_service_ingest_read },permission { id = data.datadog_permissions.role.permissions.apm_tag_management_write },permission { id = data.datadog_permissions.role.permissions.apm_primary_operation_write },permission { id = data.datadog_permissions.role.permissions.rum_apps_write },permission { id = data.datadog_permissions.role.permissions.security_monitoring_filters_read },permission { id = data.datadog_permissions.role.permissions.incident_write },permission { id = data.datadog_permissions.role.permissions.incident_settings_read },permission { id = data.datadog_permissions.role.permissions.incident_settings_write },permission { id = data.datadog_permissions.role.permissions.appsec_event_rule_write },permission { id = data.datadog_permissions.role.permissions.rum_session_replay_read },permission { id = data.datadog_permissions.role.permissions.security_monitoring_notification_profiles_read },permission { id = data.datadog_permissions.role.permissions.security_monitoring_notification_profiles_write },permission { id = data.datadog_permissions.role.permissions.apm_generate_metrics },permission { id = data.datadog_permissions.role.permissions.apm_pipelines_read },permission { id = data.datadog_permissions.role.permissions.notebooks_write },permission { id = data.datadog_permissions.role.permissions.slos_write },permission { id = data.datadog_permissions.role.permissions.slos_corrections },permission { id = data.datadog_permissions.role.permissions.usage_read },permission { id = data.datadog_permissions.role.permissions.usage_notifications_read },permission { id = data.datadog_permissions.role.permissions.observability_pipelines_read },permission { id = data.datadog_permissions.role.permissions.apm_service_catalog_read },permission { id = data.datadog_permissions.role.permissions.connections_resolve },permission { id = data.datadog_permissions.role.permissions.connections_read },permission { id = data.datadog_permissions.role.permissions.workflows_read },permission { id = data.datadog_permissions.role.permissions.workflows_run },permission { id = data.datadog_permissions.role.permissions.appsec_event_rule_read },permission { id = data.datadog_permissions.role.permissions.continuous_profiler_read }";

        Set<String> adminMinus4PermsSet = Arrays.stream(adminMinus4Perms.split(",")).collect(Collectors.toSet());

        Set<String> stdPermsSet = Arrays.stream(stdPerms.split(",")).collect(Collectors.toSet());


        String perm_desc = "# Deprecated. Privileged Access (also known as Admin permission) has been replaced by more specific permissions: Access Management, Org Management, Billing Read/Write, Usage Read/Write.@permission { id = data.datadog_permissions.role.permissions.admin }@# View and edit components in your Datadog organization that do not have explicitly defined permissions. This includes Events and other non-Account Management functionality.@permission { id = data.datadog_permissions.role.permissions.standard }@# Read log data, possibly scoped to one or more indexes. In order to read log data, a user must have both this permission and Logs Read Data. This permission can be granted in a limited capacity per index from the Logs interface or APIs. If granted via the Roles interface or API the permission has global scope.@permission { id = data.datadog_permissions.role.permissions.logs_read_index_data }@# Read and modify all indexes in your account. This includes the ability to grant the Logs Read Index Data and Logs Write Exclusion Filters permission to other roles, for some or all indexes.@permission { id = data.datadog_permissions.role.permissions.logs_modify_indexes }@# View the live tail feed for all log indexes, even if otherwise specifically restricted.@permission { id = data.datadog_permissions.role.permissions.logs_live_tail }@# Add and change exclusion filters for all or some log indexes. Can be granted in a limited capacity per index to specific roles via the Logs interface or API. If granted from the Roles interface or API, the permission has global scope.@permission { id = data.datadog_permissions.role.permissions.logs_write_exclusion_filters }@# Add and change log pipeline configurations, including the ability to grant the Logs Write Processors permission to other roles, for some or all pipelines.@permission { id = data.datadog_permissions.role.permissions.logs_write_pipelines }@# Add and change some or all log processor configurations. Can be granted in a limited capacity per pipeline to specific roles via the Logs interface or API. If granted via the Roles interface or API the permission has global scope.@permission { id = data.datadog_permissions.role.permissions.logs_write_processors }@# Add and edit Log Archives.@permission { id = data.datadog_permissions.role.permissions.logs_write_archives }@# Create custom metrics from logs.@permission { id = data.datadog_permissions.role.permissions.logs_generate_metrics }@# Delete data from your Logs, including entire indexes.@permission { id = data.datadog_permissions.role.permissions.logs_delete_data }@# Create and change dashboards.@permission { id = data.datadog_permissions.role.permissions.dashboards_write }@# Share dashboards externally.@permission { id = data.datadog_permissions.role.permissions.dashboards_public_share }@# Edit, mute, and delete individual monitors.@permission { id = data.datadog_permissions.role.permissions.monitors_write }@# Set downtimes to suppress alerts from any monitor in an organization. The ability to write monitors is not required to set downtimes.@permission { id = data.datadog_permissions.role.permissions.monitors_downtime }@# Read log data. In order to read log data, a user must have both this permission and Logs Read Index Data. This permission can be restricted with restriction queries.@permission { id = data.datadog_permissions.role.permissions.logs_read_data }@# Read Log Archives location and use it for rehydration.@permission { id = data.datadog_permissions.role.permissions.logs_read_archives }@# Read Detection Rules.@permission { id = data.datadog_permissions.role.permissions.security_monitoring_rules_read }@# Create and edit Detection Rules.@permission { id = data.datadog_permissions.role.permissions.security_monitoring_rules_write }@# View Security Signals.@permission { id = data.datadog_permissions.role.permissions.security_monitoring_signals_read }@# Modify Security Signals.@permission { id = data.datadog_permissions.role.permissions.security_monitoring_signals_write }@# Invite other users to your organization.@permission { id = data.datadog_permissions.role.permissions.user_access_invite }@# Disable users, manage user roles, and manage SAML-to-role mappings.@permission { id = data.datadog_permissions.role.permissions.user_access_manage }@# View and manage Application Keys owned by the user.@permission { id = data.datadog_permissions.role.permissions.user_app_keys }@# View Application Keys owned by all users in the organization.@permission { id = data.datadog_permissions.role.permissions.org_app_keys_read }@# Manage Application Keys owned by all users in the organization.@permission { id = data.datadog_permissions.role.permissions.org_app_keys_write }@# View, search, and use in tests the list of available private locations.@permission { id = data.datadog_permissions.role.permissions.synthetics_private_location_read }@# Create and delete private locations as well as seeing the associated installation guidelines.@permission { id = data.datadog_permissions.role.permissions.synthetics_private_location_write }@# View your organization's subscription and payment method but not make edits.@permission { id = data.datadog_permissions.role.permissions.billing_read }@# Manage your organization's subscription and payment method.@permission { id = data.datadog_permissions.role.permissions.billing_edit }@# View your organization's usage and usage attribution.@permission { id = data.datadog_permissions.role.permissions.usage_read }@# Manage your organization's usage attribution set-up.@permission { id = data.datadog_permissions.role.permissions.usage_edit }@# Edit and save tag configurations for custom metrics.@permission { id = data.datadog_permissions.role.permissions.metric_tags_write }@# Rehydrate logs from Archives.@permission { id = data.datadog_permissions.role.permissions.logs_write_historical_view }@# View Audit Logs in your organization.@permission { id = data.datadog_permissions.role.permissions.audit_logs_read }@# List and retrieve the key values of all API Keys in your organization.@permission { id = data.datadog_permissions.role.permissions.api_keys_read }@# Create, rename, and revoke API Keys for your organization.@permission { id = data.datadog_permissions.role.permissions.api_keys_write }@# View, search, and use in tests the list of global variables available for Synthetics.@permission { id = data.datadog_permissions.role.permissions.synthetics_global_variable_read }@# Create, edit, and delete global variables for Synthetics.@permission { id = data.datadog_permissions.role.permissions.synthetics_global_variable_write }@# List and view configured Synthetic tests.@permission { id = data.datadog_permissions.role.permissions.synthetics_read }@# Create, edit, and delete Synthetic tests.@permission { id = data.datadog_permissions.role.permissions.synthetics_write }@# View default settings for Synthetics Monitoring.@permission { id = data.datadog_permissions.role.permissions.synthetics_default_settings_read }@# Edit default settings for Synthetics Monitoring.@permission { id = data.datadog_permissions.role.permissions.synthetics_default_settings_write }@# Create or edit Log Facets.@permission { id = data.datadog_permissions.role.permissions.logs_write_facets }@# Create, disable, and use Service Accounts in your organization.@permission { id = data.datadog_permissions.role.permissions.service_account_write }@# Use the Integrations APIs to configure Integrations that the user has access to. This permission does not restrict or grant access to Integrations.@permission { id = data.datadog_permissions.role.permissions.integrations_api }@# Read trace retention filters. A user with this permission can view the retention filters page, list of filters, their statistics, and creation info.@permission { id = data.datadog_permissions.role.permissions.apm_retention_filter_read }@# Create, edit, and delete trace retention filters. A user with this permission can create new retention filters, and update or delete to existing retention filters.@permission { id = data.datadog_permissions.role.permissions.apm_retention_filter_write }@# Access service ingestion pages. A user with this permission can view the service ingestion page, list of root services, their statistics, and creation info.@permission { id = data.datadog_permissions.role.permissions.apm_service_ingest_read }@# Edit service ingestion pages' root services. A user with this permission can edit the root service ingestion and generate a code snippet to increase ingestion per service.@permission { id = data.datadog_permissions.role.permissions.apm_service_ingest_write }@# Set Apdex T value on any service. A user with this permission can set the T value from the Apdex graph on the service page.@permission { id = data.datadog_permissions.role.permissions.apm_apdex_manage_write }@# Edit second primary tag selection. A user with this permission can modify the second primary tag dropdown in the APM settings page.@permission { id = data.datadog_permissions.role.permissions.apm_tag_management_write }@# Edit the operation name value selection. A user with this permission can modify the operation name list in the APM settings page and the operation name controller on the service page.@permission { id = data.datadog_permissions.role.permissions.apm_primary_operation_write }@# Configure Audit Logs in your organization.@permission { id = data.datadog_permissions.role.permissions.audit_logs_write }@# Create, edit, and delete RUM Applications.@permission { id = data.datadog_permissions.role.permissions.rum_apps_write }@# View Data Scanner configurations.@permission { id = data.datadog_permissions.role.permissions.data_scanner_read }@# Edit Data Scanner configurations.@permission { id = data.datadog_permissions.role.permissions.data_scanner_write }@# Edit org configurations, including authentication and certain security preferences such as configuring SAML, renaming an org, configuring allowed login methods, creating child orgs, subscribing & unsubscribing from apps in the marketplace.@permission { id = data.datadog_permissions.role.permissions.org_management }@# Read Security Filters.@permission { id = data.datadog_permissions.role.permissions.security_monitoring_filters_read }@# Create, edit, and delete Security Filters.@permission { id = data.datadog_permissions.role.permissions.security_monitoring_filters_write }@# Create, view, and manage incidents in Datadog.@permission { id = data.datadog_permissions.role.permissions.incident_write }@# View Incidents settings.@permission { id = data.datadog_permissions.role.permissions.incident_settings_read }@# Configure Incidents settings.@permission { id = data.datadog_permissions.role.permissions.incident_settings_write }@# Edit Application Security Event Rules.@permission { id = data.datadog_permissions.role.permissions.appsec_event_rule_write }@# View Session Replays.@permission { id = data.datadog_permissions.role.permissions.rum_session_replay_read }@# Read Notification Rules.@permission { id = data.datadog_permissions.role.permissions.security_monitoring_notification_profiles_read }@# Create, edit, and delete Notification Rules.@permission { id = data.datadog_permissions.role.permissions.security_monitoring_notification_profiles_write }@# Create custom metrics from spans.@permission { id = data.datadog_permissions.role.permissions.apm_generate_metrics }@# Add and change APM pipeline configurations.@permission { id = data.datadog_permissions.role.permissions.apm_pipelines_write }@# View APM pipeline configurations.@permission { id = data.datadog_permissions.role.permissions.apm_pipelines_read }@# Create and change notebooks.@permission { id = data.datadog_permissions.role.permissions.notebooks_write }@# Schedule custom reports from a dashboard (available in beta). These reports will display any viewable data regardless of any granular restrictions (restriction queries, scoped indexes) applied to the report's creator.@permission { id = data.datadog_permissions.role.permissions.generate_dashboard_reports }@# Create, edit, and delete SLOs.@permission { id = data.datadog_permissions.role.permissions.slos_write }@# Apply, edit, and delete SLO status corrections. A user with this permission can make status corrections, even if they do not have permission to edit those SLOs.@permission { id = data.datadog_permissions.role.permissions.slos_corrections }@# View service catalog and service definitions.@permission { id = data.datadog_permissions.role.permissions.apm_service_catalog_read }@# Add, modify, and delete service catalog definitions when those definitions are maintained by Datadog.@permission { id = data.datadog_permissions.role.permissions.apm_service_catalog_write }@# Resolve workflow connections.@permission { id = data.datadog_permissions.role.permissions.connections_resolve }@# List and view available workflow connections. Connections contain secrets that cannot be revealed.@permission { id = data.datadog_permissions.role.permissions.connections_read }@# Create and delete workflow connections.@permission { id = data.datadog_permissions.role.permissions.connections_write }@# View workflows.@permission { id = data.datadog_permissions.role.permissions.workflows_read }@# Run workflows.@permission { id = data.datadog_permissions.role.permissions.workflows_run }@# Create and delete workflows.@permission { id = data.datadog_permissions.role.permissions.workflows_write }@# Install, uninstall and configure integrations.@permission { id = data.datadog_permissions.role.permissions.manage_integrations }@# View Application Security Management Event Rules.@permission { id = data.datadog_permissions.role.permissions.appsec_event_rule_read }@# View Continuous Profiler@permission { id = data.datadog_permissions.role.permissions.continuous_profiler_read }";

        Map<String, String> permToDesc = new HashMap<>();

        for (int i = 0, j = 1; j < perm_desc.split("@").length; i += 2, j += 2) {
            permToDesc.put(perm_desc.split("@")[j], perm_desc.split("@")[i]);
        }

        List<String> answer = new ArrayList<>();
        adminMinus4PermsSet.forEach(perm -> {
            if (!stdPermsSet.contains(perm)) {
                //System.out.println(permToDesc.get(perm));
                //System.out.println(perm);
                answer.add(perm);
            }
        });

        Collections.sort(answer);

        answer.forEach( perm-> {
            System.out.println(permToDesc.get(perm));
            System.out.println(perm);
        });

    }
}
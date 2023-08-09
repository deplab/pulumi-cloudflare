// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.RulesetRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetState extends com.pulumi.resources.ResourceArgs {

    public static final RulesetState Empty = new RulesetState();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Brief summary of the ruleset and its intended use.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Brief summary of the ruleset and its intended use.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `zone`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `zone`.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of the ruleset.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the ruleset.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`, `http_custom_errors`, `http_log_custom_fields`, `http_request_cache_settings`, `http_request_firewall_custom`, `http_request_firewall_managed`, `http_request_late_transform`, `http_request_late_transform_managed`, `http_request_main`, `http_request_origin`, `http_request_dynamic_redirect`, `http_request_redirect`, `http_request_sanitize`, `http_request_transform`, `http_response_firewall_managed`, `http_response_headers_transform`, `http_response_headers_transform_managed`, `http_response_compression`, `magic_transit`, `http_ratelimit`, `http_request_sbfm`, `http_config_settings`.
     * 
     */
    @Import(name="phase")
    private @Nullable Output<String> phase;

    /**
     * @return Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`, `http_custom_errors`, `http_log_custom_fields`, `http_request_cache_settings`, `http_request_firewall_custom`, `http_request_firewall_managed`, `http_request_late_transform`, `http_request_late_transform_managed`, `http_request_main`, `http_request_origin`, `http_request_dynamic_redirect`, `http_request_redirect`, `http_request_sanitize`, `http_request_transform`, `http_response_firewall_managed`, `http_response_headers_transform`, `http_response_headers_transform_managed`, `http_response_compression`, `magic_transit`, `http_ratelimit`, `http_request_sbfm`, `http_config_settings`.
     * 
     */
    public Optional<Output<String>> phase() {
        return Optional.ofNullable(this.phase);
    }

    /**
     * List of rules to apply to the ruleset.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<RulesetRuleArgs>> rules;

    /**
     * @return List of rules to apply to the ruleset.
     * 
     */
    public Optional<Output<List<RulesetRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private RulesetState() {}

    private RulesetState(RulesetState $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.kind = $.kind;
        this.name = $.name;
        this.phase = $.phase;
        this.rules = $.rules;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetState $;

        public Builder() {
            $ = new RulesetState();
        }

        public Builder(RulesetState defaults) {
            $ = new RulesetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param description Brief summary of the ruleset and its intended use.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Brief summary of the ruleset and its intended use.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param kind Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `zone`.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `zone`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param phase Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`, `http_custom_errors`, `http_log_custom_fields`, `http_request_cache_settings`, `http_request_firewall_custom`, `http_request_firewall_managed`, `http_request_late_transform`, `http_request_late_transform_managed`, `http_request_main`, `http_request_origin`, `http_request_dynamic_redirect`, `http_request_redirect`, `http_request_sanitize`, `http_request_transform`, `http_response_firewall_managed`, `http_response_headers_transform`, `http_response_headers_transform_managed`, `http_response_compression`, `magic_transit`, `http_ratelimit`, `http_request_sbfm`, `http_config_settings`.
         * 
         * @return builder
         * 
         */
        public Builder phase(@Nullable Output<String> phase) {
            $.phase = phase;
            return this;
        }

        /**
         * @param phase Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`, `http_custom_errors`, `http_log_custom_fields`, `http_request_cache_settings`, `http_request_firewall_custom`, `http_request_firewall_managed`, `http_request_late_transform`, `http_request_late_transform_managed`, `http_request_main`, `http_request_origin`, `http_request_dynamic_redirect`, `http_request_redirect`, `http_request_sanitize`, `http_request_transform`, `http_response_firewall_managed`, `http_response_headers_transform`, `http_response_headers_transform_managed`, `http_response_compression`, `magic_transit`, `http_ratelimit`, `http_request_sbfm`, `http_config_settings`.
         * 
         * @return builder
         * 
         */
        public Builder phase(String phase) {
            return phase(Output.of(phase));
        }

        /**
         * @param rules List of rules to apply to the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<RulesetRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules List of rules to apply to the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<RulesetRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules List of rules to apply to the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder rules(RulesetRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public RulesetState build() {
            return $;
        }
    }

}

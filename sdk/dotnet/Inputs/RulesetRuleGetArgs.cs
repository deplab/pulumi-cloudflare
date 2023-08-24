// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Action to perform in the ruleset rule. Available values: `block`, `challenge`, `compress_response`, `ddos_dynamic`, `ddos_mitigation`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `serve_error`, `set_cache_settings`, `set_config`, `skip`.
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// List of parameters that configure the behavior of the ruleset rule action.
        /// </summary>
        [Input("actionParameters")]
        public Input<Inputs.RulesetRuleActionParametersGetArgs>? ActionParameters { get; set; }

        /// <summary>
        /// Brief summary of the ruleset rule and its intended use.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether the rule is active.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// List of parameters that configure exposed credential checks.
        /// </summary>
        [Input("exposedCredentialCheck")]
        public Input<Inputs.RulesetRuleExposedCredentialCheckGetArgs>? ExposedCredentialCheck { get; set; }

        /// <summary>
        /// Criteria for an HTTP request to trigger the ruleset rule action. Uses the Firewall Rules expression language based on Wireshark display filters. Refer to the [Firewall Rules language](https://developers.cloudflare.com/firewall/cf-firewall-language) documentation for all available fields, operators, and functions.
        /// </summary>
        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        /// <summary>
        /// Unique rule identifier.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The most recent update to this rule.
        /// </summary>
        [Input("lastUpdated")]
        public Input<string>? LastUpdated { get; set; }

        /// <summary>
        /// List parameters to configure how the rule generates logs.
        /// </summary>
        [Input("logging")]
        public Input<Inputs.RulesetRuleLoggingGetArgs>? Logging { get; set; }

        /// <summary>
        /// List of parameters that configure HTTP rate limiting behaviour.
        /// </summary>
        [Input("ratelimit")]
        public Input<Inputs.RulesetRuleRatelimitGetArgs>? Ratelimit { get; set; }

        /// <summary>
        /// Rule reference.
        /// </summary>
        [Input("ref")]
        public Input<string>? Ref { get; set; }

        /// <summary>
        /// Version of the ruleset to deploy.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public RulesetRuleGetArgs()
        {
        }
        public static new RulesetRuleGetArgs Empty => new RulesetRuleGetArgs();
    }
}

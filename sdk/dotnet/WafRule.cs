// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Provides a Cloudflare WAF rule resource for a particular zone. This can be used to configure firewall behaviour for pre-defined firewall rules.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var rule100000 = new Cloudflare.WafRule("rule100000", new Cloudflare.WafRuleArgs
    ///         {
    ///             Mode = "simulate",
    ///             RuleId = "100000",
    ///             ZoneId = "ae36f999674d196762efcc5abb06b345",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Rules can be imported using a composite ID formed of zone ID and the WAF Rule ID, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/wafRule:WafRule 100000 ae36f999674d196762efcc5abb06b345/100000
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/wafRule:WafRule")]
    public partial class WafRule : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the WAF Rule Group that contains the rule.
        /// </summary>
        [Output("groupId")]
        public Output<string> GroupId { get; private set; } = null!;

        /// <summary>
        /// The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
        /// </summary>
        [Output("mode")]
        public Output<string> Mode { get; private set; } = null!;

        /// <summary>
        /// The ID of the WAF Rule Package that contains the rule.
        /// </summary>
        [Output("packageId")]
        public Output<string> PackageId { get; private set; } = null!;

        /// <summary>
        /// The WAF Rule ID.
        /// </summary>
        [Output("ruleId")]
        public Output<string> RuleId { get; private set; } = null!;

        /// <summary>
        /// The DNS zone ID to apply to.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a WafRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WafRule(string name, WafRuleArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/wafRule:WafRule", name, args ?? new WafRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WafRule(string name, Input<string> id, WafRuleState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/wafRule:WafRule", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing WafRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WafRule Get(string name, Input<string> id, WafRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new WafRule(name, id, state, options);
        }
    }

    public sealed class WafRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        /// <summary>
        /// The ID of the WAF Rule Package that contains the rule.
        /// </summary>
        [Input("packageId")]
        public Input<string>? PackageId { get; set; }

        /// <summary>
        /// The WAF Rule ID.
        /// </summary>
        [Input("ruleId", required: true)]
        public Input<string> RuleId { get; set; } = null!;

        /// <summary>
        /// The DNS zone ID to apply to.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public WafRuleArgs()
        {
        }
    }

    public sealed class WafRuleState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the WAF Rule Group that contains the rule.
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The ID of the WAF Rule Package that contains the rule.
        /// </summary>
        [Input("packageId")]
        public Input<string>? PackageId { get; set; }

        /// <summary>
        /// The WAF Rule ID.
        /// </summary>
        [Input("ruleId")]
        public Input<string>? RuleId { get; set; }

        /// <summary>
        /// The DNS zone ID to apply to.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public WafRuleState()
        {
        }
    }
}

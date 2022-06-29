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
    /// Define Firewall rules using filter expressions for more control over how traffic is matched to the rule.
    /// A filter expression permits selecting traffic by multiple criteria allowing greater freedom in rule creation.
    /// 
    /// Filter expressions needs to be created first before using Firewall Rule.
    /// 
    /// &gt; If you want to configure Custom Firewall rules, you need to use
    /// `cloudflare.Ruleset`, because Custom Rules are built upon the
    /// [Cloudflare Ruleset Engine](https://developers.cloudflare.com/ruleset-engine/).
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
    ///         var wordpressFilter = new Cloudflare.Filter("wordpressFilter", new Cloudflare.FilterArgs
    ///         {
    ///             ZoneId = "d41d8cd98f00b204e9800998ecf8427e",
    ///             Description = "Wordpress break-in attempts that are outside of the office",
    ///             Expression = "(http.request.uri.path ~ \".*wp-login.php\" or http.request.uri.path ~ \".*xmlrpc.php\") and ip.src ne 192.0.2.1",
    ///         });
    ///         var wordpressFirewallRule = new Cloudflare.FirewallRule("wordpressFirewallRule", new Cloudflare.FirewallRuleArgs
    ///         {
    ///             ZoneId = "d41d8cd98f00b204e9800998ecf8427e",
    ///             Description = "Block wordpress break-in attempts",
    ///             FilterId = wordpressFilter.Id,
    ///             Action = "block",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/firewallRule:FirewallRule example &lt;zone_id&gt;/&lt;firewall_rule_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/firewallRule:FirewallRule")]
    public partial class FirewallRule : Pulumi.CustomResource
    {
        /// <summary>
        /// The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `js_challenge`,
        /// `managed_challenge`, `log`, `bypass`
        /// </summary>
        [Output("action")]
        public Output<string> Action { get; private set; } = null!;

        /// <summary>
        /// A description of the rule to help identify it.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
        /// </summary>
        [Output("filterId")]
        public Output<string> FilterId { get; private set; } = null!;

        /// <summary>
        /// Whether this filter based firewall rule is currently paused.
        /// </summary>
        [Output("paused")]
        public Output<bool?> Paused { get; private set; } = null!;

        /// <summary>
        /// The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided,
        /// any rules with a priority will be sequenced before those without.
        /// </summary>
        [Output("priority")]
        public Output<int?> Priority { get; private set; } = null!;

        /// <summary>
        /// List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`,
        /// `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`
        /// </summary>
        [Output("products")]
        public Output<ImmutableArray<string>> Products { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a FirewallRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FirewallRule(string name, FirewallRuleArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/firewallRule:FirewallRule", name, args ?? new FirewallRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FirewallRule(string name, Input<string> id, FirewallRuleState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/firewallRule:FirewallRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FirewallRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FirewallRule Get(string name, Input<string> id, FirewallRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new FirewallRule(name, id, state, options);
        }
    }

    public sealed class FirewallRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `js_challenge`,
        /// `managed_challenge`, `log`, `bypass`
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// A description of the rule to help identify it.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
        /// </summary>
        [Input("filterId", required: true)]
        public Input<string> FilterId { get; set; } = null!;

        /// <summary>
        /// Whether this filter based firewall rule is currently paused.
        /// </summary>
        [Input("paused")]
        public Input<bool>? Paused { get; set; }

        /// <summary>
        /// The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided,
        /// any rules with a priority will be sequenced before those without.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        [Input("products")]
        private InputList<string>? _products;

        /// <summary>
        /// List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`,
        /// `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`
        /// </summary>
        public InputList<string> Products
        {
            get => _products ?? (_products = new InputList<string>());
            set => _products = value;
        }

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public FirewallRuleArgs()
        {
        }
    }

    public sealed class FirewallRuleState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `js_challenge`,
        /// `managed_challenge`, `log`, `bypass`
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// A description of the rule to help identify it.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
        /// </summary>
        [Input("filterId")]
        public Input<string>? FilterId { get; set; }

        /// <summary>
        /// Whether this filter based firewall rule is currently paused.
        /// </summary>
        [Input("paused")]
        public Input<bool>? Paused { get; set; }

        /// <summary>
        /// The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided,
        /// any rules with a priority will be sequenced before those without.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        [Input("products")]
        private InputList<string>? _products;

        /// <summary>
        /// List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`,
        /// `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`
        /// </summary>
        public InputList<string> Products
        {
            get => _products ?? (_products = new InputList<string>());
            set => _products = value;
        }

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public FirewallRuleState()
        {
        }
    }
}

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
    /// Allows management of the Logpull Retention settings used to control whether or not to retain HTTP request logs.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Cloudflare.LogpullRetention("example", new()
    ///     {
    ///         Enabled = true,
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/logpullRetention:LogpullRetention example &lt;zone_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/logpullRetention:LogpullRetention")]
    public partial class LogpullRetention : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether you wish to retain logs or not.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a LogpullRetention resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LogpullRetention(string name, LogpullRetentionArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/logpullRetention:LogpullRetention", name, args ?? new LogpullRetentionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LogpullRetention(string name, Input<string> id, LogpullRetentionState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/logpullRetention:LogpullRetention", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LogpullRetention resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LogpullRetention Get(string name, Input<string> id, LogpullRetentionState? state = null, CustomResourceOptions? options = null)
        {
            return new LogpullRetention(name, id, state, options);
        }
    }

    public sealed class LogpullRetentionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether you wish to retain logs or not.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public LogpullRetentionArgs()
        {
        }
        public static new LogpullRetentionArgs Empty => new LogpullRetentionArgs();
    }

    public sealed class LogpullRetentionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether you wish to retain logs or not.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public LogpullRetentionState()
        {
        }
        public static new LogpullRetentionState Empty => new LogpullRetentionState();
    }
}

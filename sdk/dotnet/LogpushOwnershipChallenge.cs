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
    /// Provides a resource which manages Cloudflare Logpush ownership
    /// challenges to use in a Logpush Job. On it's own, doesn't do much
    /// however this resource should be used in conjunction to create
    /// Logpush jobs.
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
    ///     var example = new Cloudflare.LogpushOwnershipChallenge("example", new()
    ///     {
    ///         DestinationConf = "s3://my-bucket-path?region=us-west-2",
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/logpushOwnershipChallenge:LogpushOwnershipChallenge")]
    public partial class LogpushOwnershipChallenge : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("destinationConf")]
        public Output<string> DestinationConf { get; private set; } = null!;

        /// <summary>
        /// The filename of the ownership challenge which	contains the contents required for Logpush Job creation.
        /// </summary>
        [Output("ownershipChallengeFilename")]
        public Output<string> OwnershipChallengeFilename { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        /// </summary>
        [Output("zoneId")]
        public Output<string?> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a LogpushOwnershipChallenge resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LogpushOwnershipChallenge(string name, LogpushOwnershipChallengeArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/logpushOwnershipChallenge:LogpushOwnershipChallenge", name, args ?? new LogpushOwnershipChallengeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LogpushOwnershipChallenge(string name, Input<string> id, LogpushOwnershipChallengeState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/logpushOwnershipChallenge:LogpushOwnershipChallenge", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LogpushOwnershipChallenge resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LogpushOwnershipChallenge Get(string name, Input<string> id, LogpushOwnershipChallengeState? state = null, CustomResourceOptions? options = null)
        {
            return new LogpushOwnershipChallenge(name, id, state, options);
        }
    }

    public sealed class LogpushOwnershipChallengeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("destinationConf", required: true)]
        public Input<string> DestinationConf { get; set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public LogpushOwnershipChallengeArgs()
        {
        }
        public static new LogpushOwnershipChallengeArgs Empty => new LogpushOwnershipChallengeArgs();
    }

    public sealed class LogpushOwnershipChallengeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("destinationConf")]
        public Input<string>? DestinationConf { get; set; }

        /// <summary>
        /// The filename of the ownership challenge which	contains the contents required for Logpush Job creation.
        /// </summary>
        [Input("ownershipChallengeFilename")]
        public Input<string>? OwnershipChallengeFilename { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public LogpushOwnershipChallengeState()
        {
        }
        public static new LogpushOwnershipChallengeState Empty => new LogpushOwnershipChallengeState();
    }
}

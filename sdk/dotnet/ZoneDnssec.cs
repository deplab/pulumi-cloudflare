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
    /// Provides a Cloudflare Zone DNSSEC resource.
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
    ///         var exampleZone = new Cloudflare.Zone("exampleZone", new Cloudflare.ZoneArgs
    ///         {
    ///             Zone = "example.com",
    ///         });
    ///         var exampleZoneDnssec = new Cloudflare.ZoneDnssec("exampleZoneDnssec", new Cloudflare.ZoneDnssecArgs
    ///         {
    ///             ZoneId = exampleZone.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Zone DNSSEC resource can be imported using a zone ID, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/zoneDnssec:ZoneDnssec example d41d8cd98f00b204e9800998ecf8427e
    /// ```
    /// 
    ///  where* `d41d8cd98f00b204e9800998ecf8427e` - zone ID, as returned from [API](https://api.cloudflare.com/#zone-list-zones)
    /// </summary>
    [CloudflareResourceType("cloudflare:index/zoneDnssec:ZoneDnssec")]
    public partial class ZoneDnssec : Pulumi.CustomResource
    {
        /// <summary>
        /// Zone DNSSEC algorithm.
        /// </summary>
        [Output("algorithm")]
        public Output<string> Algorithm { get; private set; } = null!;

        /// <summary>
        /// Zone DNSSEC digest.
        /// </summary>
        [Output("digest")]
        public Output<string> Digest { get; private set; } = null!;

        /// <summary>
        /// Digest algorithm use for Zone DNSSEC.
        /// </summary>
        [Output("digestAlgorithm")]
        public Output<string> DigestAlgorithm { get; private set; } = null!;

        /// <summary>
        /// Digest Type for Zone DNSSEC.
        /// </summary>
        [Output("digestType")]
        public Output<string> DigestType { get; private set; } = null!;

        /// <summary>
        /// DS for the Zone DNSSEC.
        /// </summary>
        [Output("ds")]
        public Output<string> Ds { get; private set; } = null!;

        /// <summary>
        /// Zone DNSSEC flags.
        /// </summary>
        [Output("flags")]
        public Output<int> Flags { get; private set; } = null!;

        /// <summary>
        /// Key Tag for the Zone DNSSEC.
        /// </summary>
        [Output("keyTag")]
        public Output<int> KeyTag { get; private set; } = null!;

        /// <summary>
        /// Key type used for Zone DNSSEC.
        /// </summary>
        [Output("keyType")]
        public Output<string> KeyType { get; private set; } = null!;

        /// <summary>
        /// Zone DNSSEC updated time.
        /// </summary>
        [Output("modifiedOn")]
        public Output<string> ModifiedOn { get; private set; } = null!;

        /// <summary>
        /// Public Key for the Zone DNSSEC.
        /// </summary>
        [Output("publicKey")]
        public Output<string> PublicKey { get; private set; } = null!;

        /// <summary>
        /// The status of the Zone DNSSEC.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The zone id for the zone.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ZoneDnssec resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ZoneDnssec(string name, ZoneDnssecArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/zoneDnssec:ZoneDnssec", name, args ?? new ZoneDnssecArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ZoneDnssec(string name, Input<string> id, ZoneDnssecState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/zoneDnssec:ZoneDnssec", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ZoneDnssec resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ZoneDnssec Get(string name, Input<string> id, ZoneDnssecState? state = null, CustomResourceOptions? options = null)
        {
            return new ZoneDnssec(name, id, state, options);
        }
    }

    public sealed class ZoneDnssecArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Zone DNSSEC updated time.
        /// </summary>
        [Input("modifiedOn")]
        public Input<string>? ModifiedOn { get; set; }

        /// <summary>
        /// The zone id for the zone.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public ZoneDnssecArgs()
        {
        }
    }

    public sealed class ZoneDnssecState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Zone DNSSEC algorithm.
        /// </summary>
        [Input("algorithm")]
        public Input<string>? Algorithm { get; set; }

        /// <summary>
        /// Zone DNSSEC digest.
        /// </summary>
        [Input("digest")]
        public Input<string>? Digest { get; set; }

        /// <summary>
        /// Digest algorithm use for Zone DNSSEC.
        /// </summary>
        [Input("digestAlgorithm")]
        public Input<string>? DigestAlgorithm { get; set; }

        /// <summary>
        /// Digest Type for Zone DNSSEC.
        /// </summary>
        [Input("digestType")]
        public Input<string>? DigestType { get; set; }

        /// <summary>
        /// DS for the Zone DNSSEC.
        /// </summary>
        [Input("ds")]
        public Input<string>? Ds { get; set; }

        /// <summary>
        /// Zone DNSSEC flags.
        /// </summary>
        [Input("flags")]
        public Input<int>? Flags { get; set; }

        /// <summary>
        /// Key Tag for the Zone DNSSEC.
        /// </summary>
        [Input("keyTag")]
        public Input<int>? KeyTag { get; set; }

        /// <summary>
        /// Key type used for Zone DNSSEC.
        /// </summary>
        [Input("keyType")]
        public Input<string>? KeyType { get; set; }

        /// <summary>
        /// Zone DNSSEC updated time.
        /// </summary>
        [Input("modifiedOn")]
        public Input<string>? ModifiedOn { get; set; }

        /// <summary>
        /// Public Key for the Zone DNSSEC.
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        /// <summary>
        /// The status of the Zone DNSSEC.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The zone id for the zone.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ZoneDnssecState()
        {
        }
    }
}

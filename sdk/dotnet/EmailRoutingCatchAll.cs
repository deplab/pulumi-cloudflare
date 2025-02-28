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
    /// Provides a resource for managing Email Routing Addresses catch all behaviour.
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
    ///     var example = new Cloudflare.EmailRoutingCatchAll("example", new()
    ///     {
    ///         Actions = new[]
    ///         {
    ///             new Cloudflare.Inputs.EmailRoutingCatchAllActionArgs
    ///             {
    ///                 Type = "forward",
    ///                 Values = new[]
    ///                 {
    ///                     "destinationaddress@example.net",
    ///                 },
    ///             },
    ///         },
    ///         Enabled = true,
    ///         Matchers = new[]
    ///         {
    ///             new Cloudflare.Inputs.EmailRoutingCatchAllMatcherArgs
    ///             {
    ///                 Type = "all",
    ///             },
    ///         },
    ///         Name = "example catch all",
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/emailRoutingCatchAll:EmailRoutingCatchAll")]
    public partial class EmailRoutingCatchAll : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List actions patterns.
        /// </summary>
        [Output("actions")]
        public Output<ImmutableArray<Outputs.EmailRoutingCatchAllAction>> Actions { get; private set; } = null!;

        /// <summary>
        /// Routing rule status.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Matching patterns to forward to your actions.
        /// </summary>
        [Output("matchers")]
        public Output<ImmutableArray<Outputs.EmailRoutingCatchAllMatcher>> Matchers { get; private set; } = null!;

        /// <summary>
        /// Routing rule name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Routing rule identifier.
        /// </summary>
        [Output("tag")]
        public Output<string> Tag { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a EmailRoutingCatchAll resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EmailRoutingCatchAll(string name, EmailRoutingCatchAllArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/emailRoutingCatchAll:EmailRoutingCatchAll", name, args ?? new EmailRoutingCatchAllArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EmailRoutingCatchAll(string name, Input<string> id, EmailRoutingCatchAllState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/emailRoutingCatchAll:EmailRoutingCatchAll", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EmailRoutingCatchAll resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EmailRoutingCatchAll Get(string name, Input<string> id, EmailRoutingCatchAllState? state = null, CustomResourceOptions? options = null)
        {
            return new EmailRoutingCatchAll(name, id, state, options);
        }
    }

    public sealed class EmailRoutingCatchAllArgs : global::Pulumi.ResourceArgs
    {
        [Input("actions", required: true)]
        private InputList<Inputs.EmailRoutingCatchAllActionArgs>? _actions;

        /// <summary>
        /// List actions patterns.
        /// </summary>
        public InputList<Inputs.EmailRoutingCatchAllActionArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.EmailRoutingCatchAllActionArgs>());
            set => _actions = value;
        }

        /// <summary>
        /// Routing rule status.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("matchers", required: true)]
        private InputList<Inputs.EmailRoutingCatchAllMatcherArgs>? _matchers;

        /// <summary>
        /// Matching patterns to forward to your actions.
        /// </summary>
        public InputList<Inputs.EmailRoutingCatchAllMatcherArgs> Matchers
        {
            get => _matchers ?? (_matchers = new InputList<Inputs.EmailRoutingCatchAllMatcherArgs>());
            set => _matchers = value;
        }

        /// <summary>
        /// Routing rule name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public EmailRoutingCatchAllArgs()
        {
        }
        public static new EmailRoutingCatchAllArgs Empty => new EmailRoutingCatchAllArgs();
    }

    public sealed class EmailRoutingCatchAllState : global::Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<Inputs.EmailRoutingCatchAllActionGetArgs>? _actions;

        /// <summary>
        /// List actions patterns.
        /// </summary>
        public InputList<Inputs.EmailRoutingCatchAllActionGetArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.EmailRoutingCatchAllActionGetArgs>());
            set => _actions = value;
        }

        /// <summary>
        /// Routing rule status.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("matchers")]
        private InputList<Inputs.EmailRoutingCatchAllMatcherGetArgs>? _matchers;

        /// <summary>
        /// Matching patterns to forward to your actions.
        /// </summary>
        public InputList<Inputs.EmailRoutingCatchAllMatcherGetArgs> Matchers
        {
            get => _matchers ?? (_matchers = new InputList<Inputs.EmailRoutingCatchAllMatcherGetArgs>());
            set => _matchers = value;
        }

        /// <summary>
        /// Routing rule name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Routing rule identifier.
        /// </summary>
        [Input("tag")]
        public Input<string>? Tag { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public EmailRoutingCatchAllState()
        {
        }
        public static new EmailRoutingCatchAllState Empty => new EmailRoutingCatchAllState();
    }
}

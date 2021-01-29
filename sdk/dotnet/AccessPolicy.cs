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
    /// Provides a Cloudflare Access Policy resource. Access Policies are used
    /// in conjunction with Access Applications to restrict access to a
    /// particular resource.
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
    ///         // Allowing access to `test@example.com` email address only
    ///         var testPolicyAccessPolicy = new Cloudflare.AccessPolicy("testPolicyAccessPolicy", new Cloudflare.AccessPolicyArgs
    ///         {
    ///             ApplicationId = "cb029e245cfdd66dc8d2e570d5dd3322",
    ///             ZoneId = "d41d8cd98f00b204e9800998ecf8427e",
    ///             Name = "staging policy",
    ///             Precedence = 1,
    ///             Decision = "allow",
    ///             Includes = 
    ///             {
    ///                 new Cloudflare.Inputs.AccessPolicyIncludeArgs
    ///                 {
    ///                     Emails = 
    ///                     {
    ///                         "test@example.com",
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///         // Allowing `test@example.com` to access but only when coming from a
    ///         // specific IP.
    ///         var testPolicyIndex_accessPolicyAccessPolicy = new Cloudflare.AccessPolicy("testPolicyIndex/accessPolicyAccessPolicy", new Cloudflare.AccessPolicyArgs
    ///         {
    ///             ApplicationId = "cb029e245cfdd66dc8d2e570d5dd3322",
    ///             ZoneId = "d41d8cd98f00b204e9800998ecf8427e",
    ///             Name = "staging policy",
    ///             Precedence = 1,
    ///             Decision = "allow",
    ///             Includes = 
    ///             {
    ///                 new Cloudflare.Inputs.AccessPolicyIncludeArgs
    ///                 {
    ///                     Emails = 
    ///                     {
    ///                         "test@example.com",
    ///                     },
    ///                 },
    ///             },
    ///             Requires = 
    ///             {
    ///                 { "ips", 
    ///                 {
    ///                     @var.Office_ip,
    ///                 } },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Access Policies can be imported using a composite ID formed of zone ID, application ID and policy ID.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/accessPolicy:AccessPolicy staging cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e/67ea780ce4982c1cfbe6b7293afc765d
    /// ```
    /// 
    ///  where * `cb029e245cfdd66dc8d2e570d5dd3322` - Zone ID * `d41d8cd98f00b204e9800998ecf8427e` - Access Application ID * `67ea780ce4982c1cfbe6b7293afc765d` - Access Policy ID
    /// </summary>
    [CloudflareResourceType("cloudflare:index/accessPolicy:AccessPolicy")]
    public partial class AccessPolicy : Pulumi.CustomResource
    {
        /// <summary>
        /// The account to which the access rule should be added. Conflicts with `zone_id`.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The ID of the application the policy is associated with.
        /// </summary>
        [Output("applicationId")]
        public Output<string> ApplicationId { get; private set; } = null!;

        /// <summary>
        /// Defines the action Access will take if the policy matches the user.
        /// Allowed values: `allow`, `deny`, `non_identity`, `bypass`
        /// </summary>
        [Output("decision")]
        public Output<string> Decision { get; private set; } = null!;

        /// <summary>
        /// A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
        /// </summary>
        [Output("excludes")]
        public Output<ImmutableArray<Outputs.AccessPolicyExclude>> Excludes { get; private set; } = null!;

        /// <summary>
        /// A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
        /// </summary>
        [Output("includes")]
        public Output<ImmutableArray<Outputs.AccessPolicyInclude>> Includes { get; private set; } = null!;

        /// <summary>
        /// Friendly name of the Access Application.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The unique precedence for policies on a single application. Integer.
        /// </summary>
        [Output("precedence")]
        public Output<int?> Precedence { get; private set; } = null!;

        /// <summary>
        /// A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
        /// </summary>
        [Output("requires")]
        public Output<ImmutableArray<Outputs.AccessPolicyRequire>> Requires { get; private set; } = null!;

        /// <summary>
        /// The DNS zone to which the access rule should be added. Conflicts with `account_id`.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a AccessPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessPolicy(string name, AccessPolicyArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessPolicy:AccessPolicy", name, args ?? new AccessPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessPolicy(string name, Input<string> id, AccessPolicyState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessPolicy:AccessPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessPolicy Get(string name, Input<string> id, AccessPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessPolicy(name, id, state, options);
        }
    }

    public sealed class AccessPolicyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account to which the access rule should be added. Conflicts with `zone_id`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The ID of the application the policy is associated with.
        /// </summary>
        [Input("applicationId", required: true)]
        public Input<string> ApplicationId { get; set; } = null!;

        /// <summary>
        /// Defines the action Access will take if the policy matches the user.
        /// Allowed values: `allow`, `deny`, `non_identity`, `bypass`
        /// </summary>
        [Input("decision", required: true)]
        public Input<string> Decision { get; set; } = null!;

        [Input("excludes")]
        private InputList<Inputs.AccessPolicyExcludeArgs>? _excludes;

        /// <summary>
        /// A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
        /// </summary>
        public InputList<Inputs.AccessPolicyExcludeArgs> Excludes
        {
            get => _excludes ?? (_excludes = new InputList<Inputs.AccessPolicyExcludeArgs>());
            set => _excludes = value;
        }

        [Input("includes", required: true)]
        private InputList<Inputs.AccessPolicyIncludeArgs>? _includes;

        /// <summary>
        /// A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
        /// </summary>
        public InputList<Inputs.AccessPolicyIncludeArgs> Includes
        {
            get => _includes ?? (_includes = new InputList<Inputs.AccessPolicyIncludeArgs>());
            set => _includes = value;
        }

        /// <summary>
        /// Friendly name of the Access Application.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The unique precedence for policies on a single application. Integer.
        /// </summary>
        [Input("precedence")]
        public Input<int>? Precedence { get; set; }

        [Input("requires")]
        private InputList<Inputs.AccessPolicyRequireArgs>? _requires;

        /// <summary>
        /// A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
        /// </summary>
        public InputList<Inputs.AccessPolicyRequireArgs> Requires
        {
            get => _requires ?? (_requires = new InputList<Inputs.AccessPolicyRequireArgs>());
            set => _requires = value;
        }

        /// <summary>
        /// The DNS zone to which the access rule should be added. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessPolicyArgs()
        {
        }
    }

    public sealed class AccessPolicyState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account to which the access rule should be added. Conflicts with `zone_id`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The ID of the application the policy is associated with.
        /// </summary>
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

        /// <summary>
        /// Defines the action Access will take if the policy matches the user.
        /// Allowed values: `allow`, `deny`, `non_identity`, `bypass`
        /// </summary>
        [Input("decision")]
        public Input<string>? Decision { get; set; }

        [Input("excludes")]
        private InputList<Inputs.AccessPolicyExcludeGetArgs>? _excludes;

        /// <summary>
        /// A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
        /// </summary>
        public InputList<Inputs.AccessPolicyExcludeGetArgs> Excludes
        {
            get => _excludes ?? (_excludes = new InputList<Inputs.AccessPolicyExcludeGetArgs>());
            set => _excludes = value;
        }

        [Input("includes")]
        private InputList<Inputs.AccessPolicyIncludeGetArgs>? _includes;

        /// <summary>
        /// A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
        /// </summary>
        public InputList<Inputs.AccessPolicyIncludeGetArgs> Includes
        {
            get => _includes ?? (_includes = new InputList<Inputs.AccessPolicyIncludeGetArgs>());
            set => _includes = value;
        }

        /// <summary>
        /// Friendly name of the Access Application.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The unique precedence for policies on a single application. Integer.
        /// </summary>
        [Input("precedence")]
        public Input<int>? Precedence { get; set; }

        [Input("requires")]
        private InputList<Inputs.AccessPolicyRequireGetArgs>? _requires;

        /// <summary>
        /// A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
        /// </summary>
        public InputList<Inputs.AccessPolicyRequireGetArgs> Requires
        {
            get => _requires ?? (_requires = new InputList<Inputs.AccessPolicyRequireGetArgs>());
            set => _requires = value;
        }

        /// <summary>
        /// The DNS zone to which the access rule should be added. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessPolicyState()
        {
        }
    }
}

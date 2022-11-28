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
    /// Provides a resource which manages Cloudflare API tokens.
    /// 
    /// Read more about permission groups and their applicable scopes in the
    /// [developer documentation](https://developers.cloudflare.com/api/tokens/create/permissions).
    /// </summary>
    [CloudflareResourceType("cloudflare:index/apiToken:ApiToken")]
    public partial class ApiToken : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Conditions under which the token should be considered valid.
        /// </summary>
        [Output("condition")]
        public Output<Outputs.ApiTokenCondition?> Condition { get; private set; } = null!;

        /// <summary>
        /// The expiration time on or after which the token MUST NOT be accepted for processing.
        /// </summary>
        [Output("expiresOn")]
        public Output<string?> ExpiresOn { get; private set; } = null!;

        /// <summary>
        /// Timestamp of when the token was issued.
        /// </summary>
        [Output("issuedOn")]
        public Output<string> IssuedOn { get; private set; } = null!;

        /// <summary>
        /// Timestamp of when the token was last modified.
        /// </summary>
        [Output("modifiedOn")]
        public Output<string> ModifiedOn { get; private set; } = null!;

        /// <summary>
        /// Name of the API Token.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The time before which the token MUST NOT be accepted for processing.
        /// </summary>
        [Output("notBefore")]
        public Output<string?> NotBefore { get; private set; } = null!;

        /// <summary>
        /// Permissions policy. Multiple policy blocks can be defined.
        /// </summary>
        [Output("policies")]
        public Output<ImmutableArray<Outputs.ApiTokenPolicy>> Policies { get; private set; } = null!;

        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The value of the API Token.
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;


        /// <summary>
        /// Create a ApiToken resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApiToken(string name, ApiTokenArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/apiToken:ApiToken", name, args ?? new ApiTokenArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApiToken(string name, Input<string> id, ApiTokenState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/apiToken:ApiToken", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "value",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ApiToken resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApiToken Get(string name, Input<string> id, ApiTokenState? state = null, CustomResourceOptions? options = null)
        {
            return new ApiToken(name, id, state, options);
        }
    }

    public sealed class ApiTokenArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Conditions under which the token should be considered valid.
        /// </summary>
        [Input("condition")]
        public Input<Inputs.ApiTokenConditionArgs>? Condition { get; set; }

        /// <summary>
        /// The expiration time on or after which the token MUST NOT be accepted for processing.
        /// </summary>
        [Input("expiresOn")]
        public Input<string>? ExpiresOn { get; set; }

        /// <summary>
        /// Name of the API Token.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The time before which the token MUST NOT be accepted for processing.
        /// </summary>
        [Input("notBefore")]
        public Input<string>? NotBefore { get; set; }

        [Input("policies", required: true)]
        private InputList<Inputs.ApiTokenPolicyArgs>? _policies;

        /// <summary>
        /// Permissions policy. Multiple policy blocks can be defined.
        /// </summary>
        public InputList<Inputs.ApiTokenPolicyArgs> Policies
        {
            get => _policies ?? (_policies = new InputList<Inputs.ApiTokenPolicyArgs>());
            set => _policies = value;
        }

        public ApiTokenArgs()
        {
        }
        public static new ApiTokenArgs Empty => new ApiTokenArgs();
    }

    public sealed class ApiTokenState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Conditions under which the token should be considered valid.
        /// </summary>
        [Input("condition")]
        public Input<Inputs.ApiTokenConditionGetArgs>? Condition { get; set; }

        /// <summary>
        /// The expiration time on or after which the token MUST NOT be accepted for processing.
        /// </summary>
        [Input("expiresOn")]
        public Input<string>? ExpiresOn { get; set; }

        /// <summary>
        /// Timestamp of when the token was issued.
        /// </summary>
        [Input("issuedOn")]
        public Input<string>? IssuedOn { get; set; }

        /// <summary>
        /// Timestamp of when the token was last modified.
        /// </summary>
        [Input("modifiedOn")]
        public Input<string>? ModifiedOn { get; set; }

        /// <summary>
        /// Name of the API Token.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The time before which the token MUST NOT be accepted for processing.
        /// </summary>
        [Input("notBefore")]
        public Input<string>? NotBefore { get; set; }

        [Input("policies")]
        private InputList<Inputs.ApiTokenPolicyGetArgs>? _policies;

        /// <summary>
        /// Permissions policy. Multiple policy blocks can be defined.
        /// </summary>
        public InputList<Inputs.ApiTokenPolicyGetArgs> Policies
        {
            get => _policies ?? (_policies = new InputList<Inputs.ApiTokenPolicyGetArgs>());
            set => _policies = value;
        }

        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("value")]
        private Input<string>? _value;

        /// <summary>
        /// The value of the API Token.
        /// </summary>
        public Input<string>? Value
        {
            get => _value;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _value = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ApiTokenState()
        {
        }
        public static new ApiTokenState Empty => new ApiTokenState();
    }
}

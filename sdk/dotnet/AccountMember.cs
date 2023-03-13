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
    /// Provides a resource which manages Cloudflare account members.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleUser = new Cloudflare.AccountMember("exampleUser", new()
    ///     {
    ///         EmailAddress = "user@example.com",
    ///         RoleIds = new[]
    ///         {
    ///             "68b329da9893e34099c7d8ad5cb9c940",
    ///             "d784fa8b6d98d27699781bd9a7cf19f0",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/accountMember:AccountMember example &lt;account_id&gt;/&lt;member_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/accountMember:AccountMember")]
    public partial class AccountMember : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account ID to create the account member in.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The email address of the user who you wish to manage. Following creation, this field becomes read only via the API and cannot be updated.
        /// </summary>
        [Output("emailAddress")]
        public Output<string> EmailAddress { get; private set; } = null!;

        /// <summary>
        /// List of account role IDs that you want to assign to a member.
        /// </summary>
        [Output("roleIds")]
        public Output<ImmutableArray<string>> RoleIds { get; private set; } = null!;

        /// <summary>
        /// A member's status in the account. Available values: `accepted`, `pending`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a AccountMember resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccountMember(string name, AccountMemberArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/accountMember:AccountMember", name, args ?? new AccountMemberArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccountMember(string name, Input<string> id, AccountMemberState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/accountMember:AccountMember", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccountMember resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccountMember Get(string name, Input<string> id, AccountMemberState? state = null, CustomResourceOptions? options = null)
        {
            return new AccountMember(name, id, state, options);
        }
    }

    public sealed class AccountMemberArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account ID to create the account member in.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// The email address of the user who you wish to manage. Following creation, this field becomes read only via the API and cannot be updated.
        /// </summary>
        [Input("emailAddress", required: true)]
        public Input<string> EmailAddress { get; set; } = null!;

        [Input("roleIds", required: true)]
        private InputList<string>? _roleIds;

        /// <summary>
        /// List of account role IDs that you want to assign to a member.
        /// </summary>
        public InputList<string> RoleIds
        {
            get => _roleIds ?? (_roleIds = new InputList<string>());
            set => _roleIds = value;
        }

        /// <summary>
        /// A member's status in the account. Available values: `accepted`, `pending`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public AccountMemberArgs()
        {
        }
        public static new AccountMemberArgs Empty => new AccountMemberArgs();
    }

    public sealed class AccountMemberState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account ID to create the account member in.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The email address of the user who you wish to manage. Following creation, this field becomes read only via the API and cannot be updated.
        /// </summary>
        [Input("emailAddress")]
        public Input<string>? EmailAddress { get; set; }

        [Input("roleIds")]
        private InputList<string>? _roleIds;

        /// <summary>
        /// List of account role IDs that you want to assign to a member.
        /// </summary>
        public InputList<string> RoleIds
        {
            get => _roleIds ?? (_roleIds = new InputList<string>());
            set => _roleIds = value;
        }

        /// <summary>
        /// A member's status in the account. Available values: `accepted`, `pending`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public AccountMemberState()
        {
        }
        public static new AccountMemberState Empty => new AccountMemberState();
    }
}

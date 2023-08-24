// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetApiTokenPermissionGroups
    {
        /// <summary>
        /// Use this data source to look up [API Token Permission Groups](https://developers.cloudflare.com/api/tokens/create/permissions).
        /// Commonly used as references within [`cloudflare_token`](https://www.terraform.io/docs/providers/cloudflare/r/api_token.html) resources.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Cloudflare.GetApiTokenPermissionGroups.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dnsReadPermissionId"] = all.Apply(getApiTokenPermissionGroupsResult =&gt; getApiTokenPermissionGroupsResult.Zone?.DNS_Read),
        ///         ["accountLbMonitorsAndReadId"] = all.Apply(getApiTokenPermissionGroupsResult =&gt; getApiTokenPermissionGroupsResult.Account?.Load_Balancing__Monitors_and_Pools_Read),
        ///         ["userMembershipsReadId"] = all.Apply(getApiTokenPermissionGroupsResult =&gt; getApiTokenPermissionGroupsResult.User?.Memberships_Read),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetApiTokenPermissionGroupsResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApiTokenPermissionGroupsResult>("cloudflare:index/getApiTokenPermissionGroups:getApiTokenPermissionGroups", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetApiTokenPermissionGroupsResult
    {
        /// <summary>
        /// Map of permissions for account level resources.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Account;
        /// <summary>
        /// Checksum of permissions.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Map of all permissions available. Should not be used as some permissions will overlap resource scope. Instead, use resource level specific attributes.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Permissions;
        /// <summary>
        /// Map of permissions for r2 level resources.
        /// </summary>
        public readonly ImmutableDictionary<string, string> R2;
        /// <summary>
        /// Map of permissions for user level resources.
        /// </summary>
        public readonly ImmutableDictionary<string, string> User;
        /// <summary>
        /// Map of permissions for zone level resources.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Zone;

        [OutputConstructor]
        private GetApiTokenPermissionGroupsResult(
            ImmutableDictionary<string, string> account,

            string id,

            ImmutableDictionary<string, string> permissions,

            ImmutableDictionary<string, string> r2,

            ImmutableDictionary<string, string> user,

            ImmutableDictionary<string, string> zone)
        {
            Account = account;
            Id = id;
            Permissions = permissions;
            R2 = r2;
            User = user;
            Zone = zone;
        }
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class AccessPolicyRequire
    {
        public readonly bool? AnyValidServiceToken;
        public readonly ImmutableArray<Outputs.AccessPolicyRequireAuthContext> AuthContexts;
        public readonly string? AuthMethod;
        public readonly ImmutableArray<Outputs.AccessPolicyRequireAzure> Azures;
        public readonly bool? Certificate;
        public readonly string? CommonName;
        public readonly ImmutableArray<string> DevicePostures;
        public readonly ImmutableArray<string> EmailDomains;
        public readonly ImmutableArray<string> Emails;
        public readonly bool? Everyone;
        public readonly Outputs.AccessPolicyRequireExternalEvaluation? ExternalEvaluation;
        public readonly ImmutableArray<string> Geos;
        public readonly ImmutableArray<Outputs.AccessPolicyRequireGithub> Githubs;
        public readonly ImmutableArray<string> Groups;
        public readonly ImmutableArray<Outputs.AccessPolicyRequireGsuite> Gsuites;
        public readonly ImmutableArray<string> IpLists;
        public readonly ImmutableArray<string> Ips;
        public readonly ImmutableArray<string> LoginMethods;
        public readonly ImmutableArray<Outputs.AccessPolicyRequireOkta> Oktas;
        public readonly ImmutableArray<Outputs.AccessPolicyRequireSaml> Samls;
        public readonly ImmutableArray<string> ServiceTokens;

        [OutputConstructor]
        private AccessPolicyRequire(
            bool? anyValidServiceToken,

            ImmutableArray<Outputs.AccessPolicyRequireAuthContext> authContexts,

            string? authMethod,

            ImmutableArray<Outputs.AccessPolicyRequireAzure> azures,

            bool? certificate,

            string? commonName,

            ImmutableArray<string> devicePostures,

            ImmutableArray<string> emailDomains,

            ImmutableArray<string> emails,

            bool? everyone,

            Outputs.AccessPolicyRequireExternalEvaluation? externalEvaluation,

            ImmutableArray<string> geos,

            ImmutableArray<Outputs.AccessPolicyRequireGithub> githubs,

            ImmutableArray<string> groups,

            ImmutableArray<Outputs.AccessPolicyRequireGsuite> gsuites,

            ImmutableArray<string> ipLists,

            ImmutableArray<string> ips,

            ImmutableArray<string> loginMethods,

            ImmutableArray<Outputs.AccessPolicyRequireOkta> oktas,

            ImmutableArray<Outputs.AccessPolicyRequireSaml> samls,

            ImmutableArray<string> serviceTokens)
        {
            AnyValidServiceToken = anyValidServiceToken;
            AuthContexts = authContexts;
            AuthMethod = authMethod;
            Azures = azures;
            Certificate = certificate;
            CommonName = commonName;
            DevicePostures = devicePostures;
            EmailDomains = emailDomains;
            Emails = emails;
            Everyone = everyone;
            ExternalEvaluation = externalEvaluation;
            Geos = geos;
            Githubs = githubs;
            Groups = groups;
            Gsuites = gsuites;
            IpLists = ipLists;
            Ips = ips;
            LoginMethods = loginMethods;
            Oktas = oktas;
            Samls = samls;
            ServiceTokens = serviceTokens;
        }
    }
}

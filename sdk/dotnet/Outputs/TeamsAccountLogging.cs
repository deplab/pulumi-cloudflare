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
    public sealed class TeamsAccountLogging
    {
        /// <summary>
        /// Redact personally identifiable information from activity logging (PII fields are: source IP,
        /// user email, user ID, device ID, URL, referrer, user agent).
        /// </summary>
        public readonly bool RedactPii;
        /// <summary>
        /// Represents whether all requests are logged or only the blocked requests are
        /// logged in DNS, HTTP and L4 filters.
        /// </summary>
        public readonly Outputs.TeamsAccountLoggingSettingsByRuleType SettingsByRuleType;

        [OutputConstructor]
        private TeamsAccountLogging(
            bool redactPii,

            Outputs.TeamsAccountLoggingSettingsByRuleType settingsByRuleType)
        {
            RedactPii = redactPii;
            SettingsByRuleType = settingsByRuleType;
        }
    }
}

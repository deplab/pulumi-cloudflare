// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class TeamsAccountLoggingGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Redact personally identifiable information from activity logging (PII fields are: source IP,
        /// user email, user ID, device ID, URL, referrer, user agent).
        /// </summary>
        [Input("redactPii", required: true)]
        public Input<bool> RedactPii { get; set; } = null!;

        /// <summary>
        /// Represents whether all requests are logged or only the blocked requests are
        /// logged in DNS, HTTP and L4 filters.
        /// </summary>
        [Input("settingsByRuleType", required: true)]
        public Input<Inputs.TeamsAccountLoggingSettingsByRuleTypeGetArgs> SettingsByRuleType { get; set; } = null!;

        public TeamsAccountLoggingGetArgs()
        {
        }
    }
}

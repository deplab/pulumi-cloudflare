// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Standalone Health Checks provide a way to monitor origin servers without needing a Cloudflare Load Balancer.
//
// ## Example Usage
//
// The resource supports HTTP, HTTPS and TCP type health checks.
// ### HTTPS Health Check
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v2/go/cloudflare"
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v2/go/cloudflare/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewHealthcheck(ctx, "httpHealthCheck", &cloudflare.HealthcheckArgs{
// 			ZoneId:      pulumi.Any(_var.Cloudflare_zone_id),
// 			Name:        pulumi.String("http-health-check"),
// 			Description: pulumi.String("example http health check"),
// 			Address:     pulumi.String("example.com"),
// 			Suspended:   pulumi.Bool(false),
// 			CheckRegions: pulumi.StringArray{
// 				pulumi.String("WEU"),
// 				pulumi.String("EEU"),
// 			},
// 			NotificationSuspended: pulumi.Bool(false),
// 			NotificationEmailAddresses: pulumi.StringArray{
// 				pulumi.String("hostmaster@example.com"),
// 			},
// 			Type:         pulumi.String("HTTPS"),
// 			Port:         pulumi.Int(443),
// 			Method:       pulumi.String("GET"),
// 			Path:         pulumi.String("/health"),
// 			ExpectedBody: pulumi.String("alive"),
// 			ExpectedCodes: pulumi.StringArray{
// 				pulumi.String("2xx"),
// 				pulumi.String("301"),
// 			},
// 			FollowRedirects: pulumi.Bool(true),
// 			AllowInsecure:   pulumi.Bool(false),
// 			Headers: cloudflare.HealthcheckHeaderArray{
// 				&cloudflare.HealthcheckHeaderArgs{
// 					Header: pulumi.String("Host"),
// 					Values: pulumi.StringArray{
// 						pulumi.String("example.com"),
// 					},
// 				},
// 			},
// 			Timeout:              pulumi.Int(10),
// 			Retries:              pulumi.Int(2),
// 			Interval:             pulumi.Int(60),
// 			ConsecutiveFails:     pulumi.Int(3),
// 			ConsecutiveSuccesses: pulumi.Int(2),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### TCP Monitor
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v2/go/cloudflare/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewHealthcheck(ctx, "tcpHealthCheck", &cloudflare.HealthcheckArgs{
// 			ZoneId:      pulumi.Any(_var.Cloudflare_zone_id),
// 			Name:        pulumi.String("tcp-health-check"),
// 			Description: pulumi.String("example tcp health check"),
// 			Address:     pulumi.String("example.com"),
// 			Suspended:   pulumi.Bool(false),
// 			CheckRegions: pulumi.StringArray{
// 				pulumi.String("WEU"),
// 				pulumi.String("EEU"),
// 			},
// 			NotificationSuspended: pulumi.Bool(false),
// 			NotificationEmailAddresses: pulumi.StringArray{
// 				pulumi.String("hostmaster@example.com"),
// 			},
// 			Type:                 pulumi.String("TCP"),
// 			Port:                 pulumi.Int(22),
// 			Method:               pulumi.String("connection_established"),
// 			Timeout:              pulumi.Int(10),
// 			Retries:              pulumi.Int(2),
// 			Interval:             pulumi.Int(60),
// 			ConsecutiveFails:     pulumi.Int(3),
// 			ConsecutiveSuccesses: pulumi.Int(2),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type Healthcheck struct {
	pulumi.CustomResourceState

	// The hostname or IP address of the origin server to run health checks on.
	Address pulumi.StringOutput `pulumi:"address"`
	// Do not validate the certificate when the health check uses HTTPS. Valid values: `true` or `false` (Default: `false`).
	AllowInsecure pulumi.BoolPtrOutput `pulumi:"allowInsecure"`
	// A list of regions from which to run health checks. If not set Cloudflare will pick a default region. Valid values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
	CheckRegions pulumi.StringArrayOutput `pulumi:"checkRegions"`
	// The number of consecutive fails required from a health check before changing the health to unhealthy. (Default: `1`)
	ConsecutiveFails pulumi.IntPtrOutput `pulumi:"consecutiveFails"`
	// The number of consecutive successes required from a health check before changing the health to healthy. (Default: `1`)
	ConsecutiveSuccesses pulumi.IntPtrOutput `pulumi:"consecutiveSuccesses"`
	CreatedOn            pulumi.StringOutput `pulumi:"createdOn"`
	// A human-readable description of the health check.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy.
	ExpectedBody pulumi.StringPtrOutput `pulumi:"expectedBody"`
	// The expected HTTP response codes (e.g. "200") or code ranges (e.g. "2xx" for all codes starting with 2) of the health check. (Default: `["200"]`)
	ExpectedCodes pulumi.StringArrayOutput `pulumi:"expectedCodes"`
	// Follow redirects if the origin returns a 3xx status code. Valid values: `true` or `false` (Default: `false`).
	FollowRedirects pulumi.BoolPtrOutput `pulumi:"followRedirects"`
	// The header name.
	Headers HealthcheckHeaderArrayOutput `pulumi:"headers"`
	// The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase load on the origin as we check from multiple locations. (Default: `60`)
	Interval pulumi.IntPtrOutput `pulumi:"interval"`
	// The TCP connection method to use for the health check. Valid values: `connectionEstablished` (Default: `connectionEstablished`).
	Method     pulumi.StringOutput `pulumi:"method"`
	ModifiedOn pulumi.StringOutput `pulumi:"modifiedOn"`
	// A short name to identify the health check. Only alphanumeric characters, hyphens and underscores are allowed.
	Name pulumi.StringOutput `pulumi:"name"`
	// A list of email addresses we want to send the notifications to.
	NotificationEmailAddresses pulumi.StringArrayOutput `pulumi:"notificationEmailAddresses"`
	// Whether the notifications are suspended or not. Useful for maintenance periods. Valid values: `true` or `false` (Default: `false`).
	NotificationSuspended pulumi.BoolPtrOutput `pulumi:"notificationSuspended"`
	// The endpoint path to health check against. (Default: `/`)
	Path pulumi.StringPtrOutput `pulumi:"path"`
	// Port number to connect to for the health check.  Valid values are in the range `0-65535` (Default: `80`).
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. (Default: `2`)
	Retries pulumi.IntPtrOutput `pulumi:"retries"`
	// If suspended, no health checks are sent to the origin. Valid values: `true` or `false` (Default: `false`).
	Suspended pulumi.BoolPtrOutput `pulumi:"suspended"`
	// The timeout (in seconds) before marking the health check as failed. (Default: `5`)
	Timeout pulumi.IntPtrOutput `pulumi:"timeout"`
	// The protocol to use for the health check. Valid values: `HTTP`, `HTTPS`, `TCP`.
	Type pulumi.StringOutput `pulumi:"type"`
	// The DNS zone ID to which apply settings.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewHealthcheck registers a new resource with the given unique name, arguments, and options.
func NewHealthcheck(ctx *pulumi.Context,
	name string, args *HealthcheckArgs, opts ...pulumi.ResourceOption) (*Healthcheck, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Address == nil {
		return nil, errors.New("invalid value for required argument 'Address'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource Healthcheck
	err := ctx.RegisterResource("cloudflare:index/healthcheck:Healthcheck", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHealthcheck gets an existing Healthcheck resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHealthcheck(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HealthcheckState, opts ...pulumi.ResourceOption) (*Healthcheck, error) {
	var resource Healthcheck
	err := ctx.ReadResource("cloudflare:index/healthcheck:Healthcheck", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Healthcheck resources.
type healthcheckState struct {
	// The hostname or IP address of the origin server to run health checks on.
	Address *string `pulumi:"address"`
	// Do not validate the certificate when the health check uses HTTPS. Valid values: `true` or `false` (Default: `false`).
	AllowInsecure *bool `pulumi:"allowInsecure"`
	// A list of regions from which to run health checks. If not set Cloudflare will pick a default region. Valid values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
	CheckRegions []string `pulumi:"checkRegions"`
	// The number of consecutive fails required from a health check before changing the health to unhealthy. (Default: `1`)
	ConsecutiveFails *int `pulumi:"consecutiveFails"`
	// The number of consecutive successes required from a health check before changing the health to healthy. (Default: `1`)
	ConsecutiveSuccesses *int    `pulumi:"consecutiveSuccesses"`
	CreatedOn            *string `pulumi:"createdOn"`
	// A human-readable description of the health check.
	Description *string `pulumi:"description"`
	// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy.
	ExpectedBody *string `pulumi:"expectedBody"`
	// The expected HTTP response codes (e.g. "200") or code ranges (e.g. "2xx" for all codes starting with 2) of the health check. (Default: `["200"]`)
	ExpectedCodes []string `pulumi:"expectedCodes"`
	// Follow redirects if the origin returns a 3xx status code. Valid values: `true` or `false` (Default: `false`).
	FollowRedirects *bool `pulumi:"followRedirects"`
	// The header name.
	Headers []HealthcheckHeader `pulumi:"headers"`
	// The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase load on the origin as we check from multiple locations. (Default: `60`)
	Interval *int `pulumi:"interval"`
	// The TCP connection method to use for the health check. Valid values: `connectionEstablished` (Default: `connectionEstablished`).
	Method     *string `pulumi:"method"`
	ModifiedOn *string `pulumi:"modifiedOn"`
	// A short name to identify the health check. Only alphanumeric characters, hyphens and underscores are allowed.
	Name *string `pulumi:"name"`
	// A list of email addresses we want to send the notifications to.
	NotificationEmailAddresses []string `pulumi:"notificationEmailAddresses"`
	// Whether the notifications are suspended or not. Useful for maintenance periods. Valid values: `true` or `false` (Default: `false`).
	NotificationSuspended *bool `pulumi:"notificationSuspended"`
	// The endpoint path to health check against. (Default: `/`)
	Path *string `pulumi:"path"`
	// Port number to connect to for the health check.  Valid values are in the range `0-65535` (Default: `80`).
	Port *int `pulumi:"port"`
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. (Default: `2`)
	Retries *int `pulumi:"retries"`
	// If suspended, no health checks are sent to the origin. Valid values: `true` or `false` (Default: `false`).
	Suspended *bool `pulumi:"suspended"`
	// The timeout (in seconds) before marking the health check as failed. (Default: `5`)
	Timeout *int `pulumi:"timeout"`
	// The protocol to use for the health check. Valid values: `HTTP`, `HTTPS`, `TCP`.
	Type *string `pulumi:"type"`
	// The DNS zone ID to which apply settings.
	ZoneId *string `pulumi:"zoneId"`
}

type HealthcheckState struct {
	// The hostname or IP address of the origin server to run health checks on.
	Address pulumi.StringPtrInput
	// Do not validate the certificate when the health check uses HTTPS. Valid values: `true` or `false` (Default: `false`).
	AllowInsecure pulumi.BoolPtrInput
	// A list of regions from which to run health checks. If not set Cloudflare will pick a default region. Valid values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
	CheckRegions pulumi.StringArrayInput
	// The number of consecutive fails required from a health check before changing the health to unhealthy. (Default: `1`)
	ConsecutiveFails pulumi.IntPtrInput
	// The number of consecutive successes required from a health check before changing the health to healthy. (Default: `1`)
	ConsecutiveSuccesses pulumi.IntPtrInput
	CreatedOn            pulumi.StringPtrInput
	// A human-readable description of the health check.
	Description pulumi.StringPtrInput
	// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy.
	ExpectedBody pulumi.StringPtrInput
	// The expected HTTP response codes (e.g. "200") or code ranges (e.g. "2xx" for all codes starting with 2) of the health check. (Default: `["200"]`)
	ExpectedCodes pulumi.StringArrayInput
	// Follow redirects if the origin returns a 3xx status code. Valid values: `true` or `false` (Default: `false`).
	FollowRedirects pulumi.BoolPtrInput
	// The header name.
	Headers HealthcheckHeaderArrayInput
	// The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase load on the origin as we check from multiple locations. (Default: `60`)
	Interval pulumi.IntPtrInput
	// The TCP connection method to use for the health check. Valid values: `connectionEstablished` (Default: `connectionEstablished`).
	Method     pulumi.StringPtrInput
	ModifiedOn pulumi.StringPtrInput
	// A short name to identify the health check. Only alphanumeric characters, hyphens and underscores are allowed.
	Name pulumi.StringPtrInput
	// A list of email addresses we want to send the notifications to.
	NotificationEmailAddresses pulumi.StringArrayInput
	// Whether the notifications are suspended or not. Useful for maintenance periods. Valid values: `true` or `false` (Default: `false`).
	NotificationSuspended pulumi.BoolPtrInput
	// The endpoint path to health check against. (Default: `/`)
	Path pulumi.StringPtrInput
	// Port number to connect to for the health check.  Valid values are in the range `0-65535` (Default: `80`).
	Port pulumi.IntPtrInput
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. (Default: `2`)
	Retries pulumi.IntPtrInput
	// If suspended, no health checks are sent to the origin. Valid values: `true` or `false` (Default: `false`).
	Suspended pulumi.BoolPtrInput
	// The timeout (in seconds) before marking the health check as failed. (Default: `5`)
	Timeout pulumi.IntPtrInput
	// The protocol to use for the health check. Valid values: `HTTP`, `HTTPS`, `TCP`.
	Type pulumi.StringPtrInput
	// The DNS zone ID to which apply settings.
	ZoneId pulumi.StringPtrInput
}

func (HealthcheckState) ElementType() reflect.Type {
	return reflect.TypeOf((*healthcheckState)(nil)).Elem()
}

type healthcheckArgs struct {
	// The hostname or IP address of the origin server to run health checks on.
	Address string `pulumi:"address"`
	// Do not validate the certificate when the health check uses HTTPS. Valid values: `true` or `false` (Default: `false`).
	AllowInsecure *bool `pulumi:"allowInsecure"`
	// A list of regions from which to run health checks. If not set Cloudflare will pick a default region. Valid values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
	CheckRegions []string `pulumi:"checkRegions"`
	// The number of consecutive fails required from a health check before changing the health to unhealthy. (Default: `1`)
	ConsecutiveFails *int `pulumi:"consecutiveFails"`
	// The number of consecutive successes required from a health check before changing the health to healthy. (Default: `1`)
	ConsecutiveSuccesses *int `pulumi:"consecutiveSuccesses"`
	// A human-readable description of the health check.
	Description *string `pulumi:"description"`
	// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy.
	ExpectedBody *string `pulumi:"expectedBody"`
	// The expected HTTP response codes (e.g. "200") or code ranges (e.g. "2xx" for all codes starting with 2) of the health check. (Default: `["200"]`)
	ExpectedCodes []string `pulumi:"expectedCodes"`
	// Follow redirects if the origin returns a 3xx status code. Valid values: `true` or `false` (Default: `false`).
	FollowRedirects *bool `pulumi:"followRedirects"`
	// The header name.
	Headers []HealthcheckHeader `pulumi:"headers"`
	// The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase load on the origin as we check from multiple locations. (Default: `60`)
	Interval *int `pulumi:"interval"`
	// The TCP connection method to use for the health check. Valid values: `connectionEstablished` (Default: `connectionEstablished`).
	Method *string `pulumi:"method"`
	// A short name to identify the health check. Only alphanumeric characters, hyphens and underscores are allowed.
	Name string `pulumi:"name"`
	// A list of email addresses we want to send the notifications to.
	NotificationEmailAddresses []string `pulumi:"notificationEmailAddresses"`
	// Whether the notifications are suspended or not. Useful for maintenance periods. Valid values: `true` or `false` (Default: `false`).
	NotificationSuspended *bool `pulumi:"notificationSuspended"`
	// The endpoint path to health check against. (Default: `/`)
	Path *string `pulumi:"path"`
	// Port number to connect to for the health check.  Valid values are in the range `0-65535` (Default: `80`).
	Port *int `pulumi:"port"`
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. (Default: `2`)
	Retries *int `pulumi:"retries"`
	// If suspended, no health checks are sent to the origin. Valid values: `true` or `false` (Default: `false`).
	Suspended *bool `pulumi:"suspended"`
	// The timeout (in seconds) before marking the health check as failed. (Default: `5`)
	Timeout *int `pulumi:"timeout"`
	// The protocol to use for the health check. Valid values: `HTTP`, `HTTPS`, `TCP`.
	Type string `pulumi:"type"`
	// The DNS zone ID to which apply settings.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a Healthcheck resource.
type HealthcheckArgs struct {
	// The hostname or IP address of the origin server to run health checks on.
	Address pulumi.StringInput
	// Do not validate the certificate when the health check uses HTTPS. Valid values: `true` or `false` (Default: `false`).
	AllowInsecure pulumi.BoolPtrInput
	// A list of regions from which to run health checks. If not set Cloudflare will pick a default region. Valid values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
	CheckRegions pulumi.StringArrayInput
	// The number of consecutive fails required from a health check before changing the health to unhealthy. (Default: `1`)
	ConsecutiveFails pulumi.IntPtrInput
	// The number of consecutive successes required from a health check before changing the health to healthy. (Default: `1`)
	ConsecutiveSuccesses pulumi.IntPtrInput
	// A human-readable description of the health check.
	Description pulumi.StringPtrInput
	// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy.
	ExpectedBody pulumi.StringPtrInput
	// The expected HTTP response codes (e.g. "200") or code ranges (e.g. "2xx" for all codes starting with 2) of the health check. (Default: `["200"]`)
	ExpectedCodes pulumi.StringArrayInput
	// Follow redirects if the origin returns a 3xx status code. Valid values: `true` or `false` (Default: `false`).
	FollowRedirects pulumi.BoolPtrInput
	// The header name.
	Headers HealthcheckHeaderArrayInput
	// The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase load on the origin as we check from multiple locations. (Default: `60`)
	Interval pulumi.IntPtrInput
	// The TCP connection method to use for the health check. Valid values: `connectionEstablished` (Default: `connectionEstablished`).
	Method pulumi.StringPtrInput
	// A short name to identify the health check. Only alphanumeric characters, hyphens and underscores are allowed.
	Name pulumi.StringInput
	// A list of email addresses we want to send the notifications to.
	NotificationEmailAddresses pulumi.StringArrayInput
	// Whether the notifications are suspended or not. Useful for maintenance periods. Valid values: `true` or `false` (Default: `false`).
	NotificationSuspended pulumi.BoolPtrInput
	// The endpoint path to health check against. (Default: `/`)
	Path pulumi.StringPtrInput
	// Port number to connect to for the health check.  Valid values are in the range `0-65535` (Default: `80`).
	Port pulumi.IntPtrInput
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. (Default: `2`)
	Retries pulumi.IntPtrInput
	// If suspended, no health checks are sent to the origin. Valid values: `true` or `false` (Default: `false`).
	Suspended pulumi.BoolPtrInput
	// The timeout (in seconds) before marking the health check as failed. (Default: `5`)
	Timeout pulumi.IntPtrInput
	// The protocol to use for the health check. Valid values: `HTTP`, `HTTPS`, `TCP`.
	Type pulumi.StringInput
	// The DNS zone ID to which apply settings.
	ZoneId pulumi.StringInput
}

func (HealthcheckArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*healthcheckArgs)(nil)).Elem()
}

type HealthcheckInput interface {
	pulumi.Input

	ToHealthcheckOutput() HealthcheckOutput
	ToHealthcheckOutputWithContext(ctx context.Context) HealthcheckOutput
}

func (*Healthcheck) ElementType() reflect.Type {
	return reflect.TypeOf((*Healthcheck)(nil))
}

func (i *Healthcheck) ToHealthcheckOutput() HealthcheckOutput {
	return i.ToHealthcheckOutputWithContext(context.Background())
}

func (i *Healthcheck) ToHealthcheckOutputWithContext(ctx context.Context) HealthcheckOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HealthcheckOutput)
}

type HealthcheckOutput struct {
	*pulumi.OutputState
}

func (HealthcheckOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Healthcheck)(nil))
}

func (o HealthcheckOutput) ToHealthcheckOutput() HealthcheckOutput {
	return o
}

func (o HealthcheckOutput) ToHealthcheckOutputWithContext(ctx context.Context) HealthcheckOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(HealthcheckOutput{})
}

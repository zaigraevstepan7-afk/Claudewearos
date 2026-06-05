package com.google.android.gms.internal.ads;

import nc.h2;
import nc.t;
import qc.q;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfdp {
    public static h2 zza(Throwable th2) {
        if (th2 instanceof zzedi) {
            zzedi zzediVar = (zzedi) th2;
            return zzc(zzediVar.zza(), zzediVar.zzb());
        }
        if (th2 instanceof zzdwe) {
            return th2.getMessage() == null ? zzd(((zzdwe) th2).zza(), null, null) : zzd(((zzdwe) th2).zza(), th2.getMessage(), null);
        }
        if (!(th2 instanceof q)) {
            return zzd(1, null, null);
        }
        q qVar = (q) th2;
        return new h2(qVar.f13442a, zzfvv.zzc(qVar.getMessage()), "com.google.android.gms.ads", null, null);
    }

    public static h2 zzb(Throwable th2, zzedj zzedjVar) {
        h2 h2Var;
        h2 h2VarZza = zza(th2);
        int i10 = h2VarZza.f12114a;
        if ((i10 == 3 || i10 == 0) && (h2Var = h2VarZza.f12117d) != null && !h2Var.f12116c.equals("com.google.android.gms.ads")) {
            h2VarZza.f12117d = null;
        }
        if (zzedjVar != null) {
            h2VarZza.f12118e = zzedjVar.zzb();
        }
        return h2VarZza;
    }

    public static h2 zzc(int i10, h2 h2Var) {
        if (i10 == 0) {
            throw null;
        }
        if (i10 == 8) {
            if (((Integer) t.f12227d.f12230c.zzb(zzbdc.zziy)).intValue() > 0) {
                return h2Var;
            }
            i10 = 8;
        }
        return zzd(i10, null, h2Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static h2 zzd(int i10, String str, h2 h2Var) {
        String str2;
        int i11 = i10 - 1;
        if (str == null) {
            if (i10 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i11) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) t.f12227d.f12230c.zzb(zzbdc.zziB)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i10 == 0) {
            throw null;
        }
        int i12 = 0;
        int i13 = 2;
        switch (i11) {
            case 0:
            case 11:
            case 15:
                i13 = i12;
                return new h2(i13, str3, "com.google.android.gms.ads", h2Var, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i13 = 1;
                return new h2(i13, str3, "com.google.android.gms.ads", h2Var, null);
            case 2:
            case 10:
            case 18:
                i13 = 3;
                return new h2(i13, str3, "com.google.android.gms.ads", h2Var, null);
            case 3:
                i12 = 8;
                i13 = i12;
                return new h2(i13, str3, "com.google.android.gms.ads", h2Var, null);
            case 4:
            case 8:
            case 17:
                return new h2(i13, str3, "com.google.android.gms.ads", h2Var, null);
            case 7:
                i12 = 4;
                i13 = i12;
                return new h2(i13, str3, "com.google.android.gms.ads", h2Var, null);
            case 12:
                if (((Integer) t.f12227d.f12230c.zzb(zzbdc.zziB)).intValue() <= 0) {
                    i12 = 9;
                    i13 = i12;
                    return new h2(i13, str3, "com.google.android.gms.ads", h2Var, null);
                }
                i13 = 3;
                return new h2(i13, str3, "com.google.android.gms.ads", h2Var, null);
            case 13:
                i12 = 10;
                i13 = i12;
                return new h2(i13, str3, "com.google.android.gms.ads", h2Var, null);
            case 14:
                i12 = 11;
                i13 = i12;
                return new h2(i13, str3, "com.google.android.gms.ads", h2Var, null);
            default:
                switch (i10) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }
}

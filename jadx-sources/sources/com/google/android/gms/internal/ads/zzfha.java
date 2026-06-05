package com.google.android.gms.internal.ads;

import android.content.Context;
import nc.q3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzfha {
    public static zzfhb zza(Context context, int i10) {
        boolean zBooleanValue;
        if (zzfhp.zza()) {
            int i11 = i10 - 2;
            if (i11 != 20 && i11 != 21) {
                switch (i11) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) zzbev.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) zzbev.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) zzbev.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) zzbev.zze.zze()).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfhd(context, i10);
            }
        }
        return new zzfii();
    }

    public static zzfhb zzb(Context context, int i10, int i11, q3 q3Var) {
        zzfhb zzfhbVarZza = zza(context, i10);
        if (zzfhbVarZza instanceof zzfhd) {
            zzfhbVarZza.zzi();
            zzfhbVarZza.zzn(i11);
            zzfhbVarZza.zzf(u3.c.u(q3Var.F));
            String str = q3Var.I;
            if (zzfhl.zze(str)) {
                zzfhbVarZza.zze(str);
            }
        }
        return zzfhbVarZza;
    }
}

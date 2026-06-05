package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbch;
import java.util.ArrayList;
import mc.n;
import qc.n0;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeaw extends zzeax {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcuu zzd;
    private final TelephonyManager zze;
    private final zzeao zzf;
    private zzbch.zzq zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbch.zzaf.zzd.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbch.zzaf.zzd zzdVar = zzbch.zzaf.zzd.CONNECTING;
        sparseArray.put(iOrdinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbch.zzaf.zzd.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbch.zzaf.zzd zzdVar2 = zzbch.zzaf.zzd.DISCONNECTED;
        sparseArray.put(iOrdinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbch.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    public zzeaw(Context context, zzcuu zzcuuVar, zzeao zzeaoVar, zzeak zzeakVar, n0 n0Var) {
        super(zzeakVar, n0Var);
        this.zzc = context;
        this.zzd = zzcuuVar;
        this.zzf = zzeaoVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    public static /* bridge */ /* synthetic */ zzbch.zzab zza(zzeaw zzeawVar, Bundle bundle) {
        zzbch.zzab.zzb zzbVar;
        zzbch.zzab.zza zzaVarZza = zzbch.zzab.zza();
        int i10 = bundle.getInt("cnt", -2);
        int i11 = bundle.getInt("gnt", 0);
        if (i10 == -1) {
            zzeawVar.zzg = zzbch.zzq.ENUM_TRUE;
        } else {
            zzeawVar.zzg = zzbch.zzq.ENUM_FALSE;
            if (i10 == 0) {
                zzaVarZza.zzd(zzbch.zzab.zzc.CELL);
            } else if (i10 != 1) {
                zzaVarZza.zzd(zzbch.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzaVarZza.zzd(zzbch.zzab.zzc.WIFI);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbch.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbch.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbch.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbch.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzaVarZza.zzc(zzbVar);
        }
        return zzaVarZza.zzbr();
    }

    public static /* bridge */ /* synthetic */ zzbch.zzaf.zzd zzb(zzeaw zzeawVar, Bundle bundle) {
        return (zzbch.zzaf.zzd) zzb.get(zzfdc.zza(zzfdc.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbch.zzaf.zzd.UNSPECIFIED);
    }

    public static byte[] zze(zzeaw zzeawVar, boolean z2, ArrayList arrayList, zzbch.zzab zzabVar, zzbch.zzaf.zzd zzdVar) {
        zzbch.zzaf.zza.C0002zza c0002zzaZzn = zzbch.zzaf.zza.zzn();
        c0002zzaZzn.zzn(arrayList);
        Context context = zzeawVar.zzc;
        c0002zzaZzn.zzD(zzg(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0));
        TelephonyManager telephonyManager = zzeawVar.zze;
        n nVar = n.D;
        nVar.f11580f.getClass();
        zzbch.zzq zzqVar = (r0.b(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) ? zzbch.zzq.ENUM_TRUE : zzbch.zzq.ENUM_FALSE;
        c0002zzaZzn.zzE(zzqVar);
        zzeao zzeaoVar = zzeawVar.zzf;
        c0002zzaZzn.zzM(zzeaoVar.zze());
        c0002zzaZzn.zzL(zzeaoVar.zzb());
        c0002zzaZzn.zzG(zzeaoVar.zza());
        c0002zzaZzn.zzH(zzdVar);
        c0002zzaZzn.zzJ(zzabVar);
        c0002zzaZzn.zzK(zzeawVar.zzg);
        c0002zzaZzn.zzN(zzg(z2));
        c0002zzaZzn.zzP(zzeaoVar.zzd());
        nVar.f11584k.getClass();
        c0002zzaZzn.zzO(System.currentTimeMillis());
        c0002zzaZzn.zzQ(zzg(Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0));
        return c0002zzaZzn.zzbr().zzaV();
    }

    private static final zzbch.zzq zzg(boolean z2) {
        return z2 ? zzbch.zzq.ENUM_TRUE : zzbch.zzq.ENUM_FALSE;
    }

    public final void zzd(boolean z2) {
        zzgdb.zzr(this.zzd.zzb(new Bundle()), new zzeav(this, z2), zzcad.zzg);
    }
}

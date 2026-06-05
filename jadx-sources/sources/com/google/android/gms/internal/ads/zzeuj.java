package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;
import mc.n;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeuj implements zzetu {
    private final zzgdm zza;
    private final Context zzb;

    public zzeuj(zzgdm zzgdmVar, Context context) {
        this.zza = zzgdmVar;
        this.zzb = context;
    }

    public static zzeuh zzc(zzeuj zzeujVar) {
        boolean zIsActiveNetworkMetered;
        int i10;
        Context context = zzeujVar.zzb;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        n nVar = n.D;
        r0 r0Var = nVar.f11577c;
        int i11 = -1;
        if (r0.b(context, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                i10 = type;
                i11 = iOrdinal;
            } else {
                i10 = -1;
            }
            zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        } else {
            zIsActiveNetworkMetered = false;
            i10 = -2;
        }
        return new zzeuh(networkOperator, i10, nVar.f11580f.c(context), phoneType, zIsActiveNetworkMetered, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeui
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeuj.zzc(this.zza);
            }
        });
    }
}

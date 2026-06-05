package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdjs implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdnr zzd;
    private final ud.a zze;
    private zzbie zzf;
    private zzbkd zzg;

    public zzdjs(zzdnr zzdnrVar, ud.a aVar) {
        this.zzd = zzdnrVar;
        this.zze = aVar;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap map = new HashMap();
            map.put("id", this.zza);
            ((ud.b) this.zze).getClass();
            map.put("time_interval", String.valueOf(System.currentTimeMillis() - this.zzb.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.zzd.zzj("sendMessageToNativeJs", map);
        }
        zzd();
    }

    public final zzbie zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zze();
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void zzc(final zzbie zzbieVar) {
        this.zzf = zzbieVar;
        zzbkd zzbkdVar = this.zzg;
        if (zzbkdVar != null) {
            this.zzd.zzn("/unconfirmedClick", zzbkdVar);
        }
        zzbkd zzbkdVar2 = new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdjr
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                zzdjs zzdjsVar = this.zza;
                try {
                    zzdjsVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i10 = l0.f13401b;
                    k.d("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbie zzbieVar2 = zzbieVar;
                zzdjsVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbieVar2 == null) {
                    int i11 = l0.f13401b;
                    k.b("Received unconfirmed click but UnconfirmedClickListener is null.");
                } else {
                    try {
                        zzbieVar2.zzf(str);
                    } catch (RemoteException e10) {
                        k.i("#007 Could not call remote method.", e10);
                    }
                }
            }
        };
        this.zzg = zzbkdVar2;
        this.zzd.zzl("/unconfirmedClick", zzbkdVar2);
    }
}

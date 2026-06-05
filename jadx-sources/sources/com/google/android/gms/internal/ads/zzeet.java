package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import f0.a1;
import java.util.concurrent.Executor;
import nc.t;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeet implements zzede {
    private final Context zza;
    private final zzdfy zzb;
    private final Executor zzc;
    private final zzfbs zzd;
    private final zzdsc zze;

    public zzeet(Context context, Executor executor, zzdfy zzdfyVar, zzfbs zzfbsVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = zzdfyVar;
        this.zzc = executor;
        this.zzd = zzfbsVar;
        this.zze = zzdscVar;
    }

    public static /* synthetic */ mf.a zzd(zzeet zzeetVar, Uri uri, zzfcf zzfcfVar, zzfbt zzfbtVar, zzfbw zzfbwVar, Object obj) {
        try {
            Intent intent = (Intent) new a1(3).a().f15363b;
            intent.setData(uri);
            pc.e eVar = new pc.e(intent, null);
            zzcai zzcaiVar = new zzcai();
            zzdev zzdevVarZzd = zzeetVar.zzb.zzd(new zzcrl(zzfcfVar, zzfbtVar, null), new zzdey(new zzees(zzeetVar, zzcaiVar, zzfbtVar), null));
            zzcaiVar.zzc(new AdOverlayInfoParcel(eVar, null, zzdevVarZzd.zza(), null, new rc.a(0, 0, false), null, null, zzfbwVar.zzb));
            zzeetVar.zzd.zza();
            return zzgdb.zzh(zzdevVarZzd.zzg());
        } catch (Throwable th2) {
            int i10 = l0.f13401b;
            k.e("Error in CustomTabsAdRenderer", th2);
            throw th2;
        }
    }

    private static String zze(zzfbt zzfbtVar) {
        try {
            return zzfbtVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final mf.a zza(final zzfcf zzfcfVar, final zzfbt zzfbtVar) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznl)).booleanValue()) {
            zzdsb zzdsbVarZza = this.zze.zza();
            zzdsbVarZza.zzb("action", "cstm_tbs_rndr");
            zzdsbVarZza.zzj();
        }
        String strZze = zze(zzfbtVar);
        final Uri uri = strZze != null ? Uri.parse(strZze) : null;
        final zzfbw zzfbwVar = zzfcfVar.zzb.zzb;
        return zzgdb.zzn(zzgdb.zzh(null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzeer
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzeet.zzd(this.zza, uri, zzfcfVar, zzfbtVar, zzfbwVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbed.zzg(context) && !TextUtils.isEmpty(zze(zzfbtVar));
    }
}

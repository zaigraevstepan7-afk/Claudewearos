package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzbch;
import java.lang.reflect.InvocationTargetException;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdgl implements zzcvr, zzddb {
    private final zzbyi zza;
    private final Context zzb;
    private final zzbym zzc;
    private final View zzd;
    private String zze;
    private final zzbch.zza.EnumC0000zza zzf;

    public zzdgl(zzbyi zzbyiVar, Context context, zzbym zzbymVar, View view, zzbch.zza.EnumC0000zza enumC0000zza) {
        this.zza = zzbyiVar;
        this.zzb = context;
        this.zzc = zzbymVar;
        this.zzd = view;
        this.zzf = enumC0000zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zza() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzc() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzo(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzdu(zzbwa zzbwaVar, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzbym zzbymVar = this.zzc;
        Context context = this.zzb;
        if (zzbymVar.zzp(context)) {
            try {
                zzbymVar.zzl(context, zzbymVar.zzb(context), this.zza.zza(), zzbwaVar.zzc(), zzbwaVar.zzb());
            } catch (RemoteException e10) {
                int i10 = l0.f13401b;
                k.h("Remote Exception to get reward item.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzj() {
        zzbch.zza.EnumC0000zza enumC0000zza = this.zzf;
        if (enumC0000zza == zzbch.zza.EnumC0000zza.APP_OPEN) {
            return;
        }
        String strZzd = this.zzc.zzd(this.zzb);
        this.zze = strZzd;
        this.zze = String.valueOf(strZzd).concat(enumC0000zza == zzbch.zza.EnumC0000zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzi() {
    }
}

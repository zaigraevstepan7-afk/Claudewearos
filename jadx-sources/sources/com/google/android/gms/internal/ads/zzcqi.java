package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import mc.n;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcqi implements zzcxf, zzcwl {
    private final Context zza;
    private final zzcfe zzb;
    private final zzfbt zzc;
    private final rc.a zzd;
    private zzecz zze;
    private boolean zzf;
    private final zzecx zzg;

    public zzcqi(Context context, zzcfe zzcfeVar, zzfbt zzfbtVar, rc.a aVar, zzecx zzecxVar) {
        this.zza = context;
        this.zzb = zzcfeVar;
        this.zzc = zzfbtVar;
        this.zzd = aVar;
        this.zzg = zzecxVar;
    }

    private final synchronized void zza() {
        zzcfe zzcfeVar;
        zzecw zzecwVar;
        zzecv zzecvVar;
        try {
            zzfbt zzfbtVar = this.zzc;
            if (zzfbtVar.zzT && (zzcfeVar = this.zzb) != null) {
                Context context = this.zza;
                n nVar = n.D;
                if (nVar.f11598y.zzl(context)) {
                    rc.a aVar = this.zzd;
                    String str = aVar.f14322b + "." + aVar.f14323c;
                    zzfcr zzfcrVar = zzfbtVar.zzV;
                    String strZza = zzfcrVar.zza();
                    if (zzfcrVar.zzc() == 1) {
                        zzecvVar = zzecv.VIDEO;
                        zzecwVar = zzecw.DEFINED_BY_JAVASCRIPT;
                    } else {
                        int i10 = zzfbtVar.zze;
                        zzecv zzecvVar2 = zzecv.HTML_DISPLAY;
                        zzecwVar = i10 == 1 ? zzecw.ONE_PIXEL : zzecw.BEGIN_TO_RENDER;
                        zzecvVar = zzecvVar2;
                    }
                    zzecz zzeczVarZza = nVar.f11598y.zza(str, zzcfeVar.zzG(), "", "javascript", strZza, zzecwVar, zzecvVar, zzfbtVar.zzal);
                    this.zze = zzeczVarZza;
                    if (zzeczVarZza != null) {
                        zzfld zzfldVarZza = zzeczVarZza.zza();
                        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfw)).booleanValue()) {
                            nVar.f11598y.zzj(zzfldVarZza, zzcfeVar.zzG());
                            Iterator it = zzcfeVar.zzV().iterator();
                            while (it.hasNext()) {
                                n.D.f11598y.zzg(zzfldVarZza, (View) it.next());
                            }
                        } else {
                            nVar.f11598y.zzj(zzfldVarZza, zzcfeVar.zzF());
                        }
                        zzcfeVar.zzat(this.zze);
                        n.D.f11598y.zzk(zzfldVarZza);
                        this.zzf = true;
                        zzcfeVar.zzd("onSdkLoaded", new q.e(0));
                    }
                }
            }
        } finally {
        }
    }

    private final boolean zzb() {
        return ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfx)).booleanValue() && this.zzg.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final synchronized void zzs() {
        zzcfe zzcfeVar;
        if (zzb()) {
            this.zzg.zzb();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzcfeVar = this.zzb) == null) {
            return;
        }
        zzcfeVar.zzd("onSdkImpression", new q.e(0));
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final synchronized void zzt() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}

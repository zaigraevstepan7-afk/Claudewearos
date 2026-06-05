package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import mc.n;
import nc.t;
import pc.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdgh implements zzcxf, m, zzcwl {
    zzecz zza;
    private final Context zzb;
    private final zzcfe zzc;
    private final zzfbt zzd;
    private final rc.a zze;
    private final zzecx zzf;

    public zzdgh(Context context, zzcfe zzcfeVar, zzfbt zzfbtVar, rc.a aVar, zzecx zzecxVar) {
        this.zzb = context;
        this.zzc = zzcfeVar;
        this.zzd = zzfbtVar;
        this.zze = aVar;
        this.zzf = zzecxVar;
    }

    private final boolean zzg() {
        return ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfx)).booleanValue() && this.zzf.zzd();
    }

    @Override // pc.m
    public final void zzdt() {
        zzcfe zzcfeVar;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfA)).booleanValue() || (zzcfeVar = this.zzc) == null) {
            return;
        }
        if (this.zza != null || zzg()) {
            if (this.zza != null) {
                zzcfeVar.zzd("onSdkImpression", new q.e(0));
            } else {
                this.zzf.zzb();
            }
        }
    }

    @Override // pc.m
    public final void zzdw(int i10) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzs() {
        zzcfe zzcfeVar;
        if (zzg()) {
            this.zzf.zzb();
        } else {
            if (this.zza == null || (zzcfeVar = this.zzc) == null) {
                return;
            }
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfA)).booleanValue()) {
                zzcfeVar.zzd("onSdkImpression", new q.e(0));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzt() {
        zzcfe zzcfeVar;
        zzecw zzecwVar;
        zzecv zzecvVar;
        zzfbt zzfbtVar = this.zzd;
        if (!zzfbtVar.zzT || (zzcfeVar = this.zzc) == null) {
            return;
        }
        Context context = this.zzb;
        n nVar = n.D;
        zzect zzectVar = nVar.f11598y;
        zzect zzectVar2 = nVar.f11598y;
        if (zzectVar.zzl(context)) {
            if (zzg()) {
                this.zzf.zzc();
                return;
            }
            rc.a aVar = this.zze;
            String str = aVar.f14322b + "." + aVar.f14323c;
            zzfcr zzfcrVar = zzfbtVar.zzV;
            String strZza = zzfcrVar.zza();
            if (zzfcrVar.zzc() == 1) {
                zzecvVar = zzecv.VIDEO;
                zzecwVar = zzecw.DEFINED_BY_JAVASCRIPT;
            } else {
                zzecwVar = zzfbtVar.zzY == 2 ? zzecw.UNSPECIFIED : zzecw.BEGIN_TO_RENDER;
                zzecvVar = zzecv.HTML_DISPLAY;
            }
            zzecz zzeczVarZza = nVar.f11598y.zza(str, zzcfeVar.zzG(), "", "javascript", strZza, zzecwVar, zzecvVar, zzfbtVar.zzal);
            this.zza = zzeczVarZza;
            if (zzeczVarZza != null) {
                zzfld zzfldVarZza = zzeczVarZza.zza();
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfw)).booleanValue()) {
                    zzectVar2.zzj(zzfldVarZza, zzcfeVar.zzG());
                    Iterator it = zzcfeVar.zzV().iterator();
                    while (it.hasNext()) {
                        n.D.f11598y.zzg(zzfldVarZza, (View) it.next());
                    }
                } else {
                    zzectVar2.zzj(zzfldVarZza, zzcfeVar.zzF());
                }
                zzcfeVar.zzat(this.zza);
                n.D.f11598y.zzk(zzfldVarZza);
                zzcfeVar.zzd("onSdkLoaded", new q.e(0));
            }
        }
    }

    @Override // pc.m
    public final void zzdH() {
    }

    @Override // pc.m
    public final void zzdk() {
    }

    @Override // pc.m
    public final void zzds() {
    }

    @Override // pc.m
    public final void zzdv() {
    }
}

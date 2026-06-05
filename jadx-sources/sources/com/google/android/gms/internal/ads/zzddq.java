package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzddq extends zzdbm implements zzazb {
    private final Map zzb;
    private final Context zzc;
    private final zzfbt zzd;

    public zzddq(Context context, Set set, zzfbt zzfbtVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfbtVar;
    }

    public final synchronized void zza(View view) {
        try {
            Map map = this.zzb;
            zzazc zzazcVar = (zzazc) map.get(view);
            if (zzazcVar == null) {
                zzazc zzazcVar2 = new zzazc(this.zzc, view);
                zzazcVar2.zzd(this);
                map.put(view, zzazcVar2);
                zzazcVar = zzazcVar2;
            }
            if (this.zzd.zzX) {
                zzbct zzbctVar = zzbdc.zzbz;
                t tVar = t.f12227d;
                if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                    zzazcVar.zzg(((Long) tVar.f12230c.zzb(zzbdc.zzby)).longValue());
                    return;
                }
            }
            zzazcVar.zzf();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzb(View view) {
        Map map = this.zzb;
        if (map.containsKey(view)) {
            ((zzazc) map.get(view)).zze(this);
            map.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazb
    public final synchronized void zzdr(final zzaza zzazaVar) {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzddp
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzazb) obj).zzdr(zzazaVar);
            }
        });
    }
}

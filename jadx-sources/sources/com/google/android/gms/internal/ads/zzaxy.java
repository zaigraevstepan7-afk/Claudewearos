package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaxy extends zzayi {
    private List zzh;
    private final Context zzi;

    public zzaxy(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11, Context context) {
        super(zzawvVar, "G1O+5tqulLBNCxZxcYiJSAGrazgAMWmQ49z8g8PEPhhOgnBizp9p2UWwJMiSx+ju", "xfUFYLaeYlsk7z1gy27YVxCq/UzpfsdVkNtosT4BuNc=", zzasrVar, i10, 31);
        this.zzh = null;
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        zzasr zzasrVar = this.zzd;
        zzasrVar.zzU(-1L);
        zzasrVar.zzQ(-1L);
        Context contextZzb = this.zzi;
        if (contextZzb == null) {
            contextZzb = this.zza.zzb();
        }
        if (this.zzh == null) {
            this.zzh = (List) this.zze.invoke(null, contextZzb);
        }
        List list = this.zzh;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (zzasrVar) {
            zzasrVar.zzU(((Long) this.zzh.get(0)).longValue());
            zzasrVar.zzQ(((Long) this.zzh.get(1)).longValue());
        }
    }
}

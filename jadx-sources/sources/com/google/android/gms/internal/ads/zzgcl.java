package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
abstract class zzgcl extends zzgcb {
    private List zza;

    public zzgcl(zzfya zzfyaVar, boolean z2) {
        super(zzfyaVar, z2, true);
        List listZzb = zzfyaVar.isEmpty() ? Collections.EMPTY_LIST : zzfyv.zzb(zzfyaVar.size());
        for (int i10 = 0; i10 < zzfyaVar.size(); i10++) {
            listZzb.add(null);
        }
        this.zza = listZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final void zzA(int i10) {
        super.zzA(i10);
        this.zza = null;
    }

    public abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final void zzx(int i10, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i10, new zzgck(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final void zzy() {
        List list = this.zza;
        if (list != null) {
            zzc(zzD(list));
        }
    }
}

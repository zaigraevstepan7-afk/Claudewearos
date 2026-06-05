package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaks implements zzadw {
    private final zzadw zzb;
    private final zzakp zzc;
    private final SparseArray zzd = new SparseArray();
    private boolean zze;

    public zzaks(zzadw zzadwVar, zzakp zzakpVar) {
        this.zzb = zzadwVar;
        this.zzc = zzakpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final void zzG() {
        this.zzb.zzG();
        if (!this.zze) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.zzd;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((zzaku) sparseArray.valueAt(i10)).zzb(true);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final void zzP(zzaes zzaesVar) {
        this.zzb.zzP(zzaesVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final zzaez zzw(int i10, int i11) {
        if (i11 != 3) {
            this.zze = true;
            return this.zzb.zzw(i10, i11);
        }
        SparseArray sparseArray = this.zzd;
        zzaku zzakuVar = (zzaku) sparseArray.get(i10);
        if (zzakuVar != null) {
            return zzakuVar;
        }
        zzaku zzakuVar2 = new zzaku(this.zzb.zzw(i10, 3), this.zzc);
        sparseArray.put(i10, zzakuVar2);
        return zzakuVar2;
    }
}

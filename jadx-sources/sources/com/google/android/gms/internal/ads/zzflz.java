package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzflz {
    private static final zzflz zza = new zzflz();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzflz() {
    }

    public static zzflz zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzflh zzflhVar) {
        this.zzb.add(zzflhVar);
    }

    public final void zze(zzflh zzflhVar) {
        ArrayList arrayList = this.zzb;
        boolean zZzg = zzg();
        arrayList.remove(zzflhVar);
        this.zzc.remove(zzflhVar);
        if (!zZzg || zzg()) {
            return;
        }
        zzfmh.zzb().zzg();
    }

    public final void zzf(zzflh zzflhVar) {
        ArrayList arrayList = this.zzc;
        boolean zZzg = zzg();
        arrayList.add(zzflhVar);
        if (zZzg) {
            return;
        }
        zzfmh.zzb().zzf();
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}

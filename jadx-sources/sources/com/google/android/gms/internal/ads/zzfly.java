package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfly extends zzfmb {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfly zzb = new zzfly();

    private zzfly() {
    }

    public static zzfly zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfmb
    public final void zzb(boolean z2) {
        Iterator it = zzflz.zza().zzc().iterator();
        while (it.hasNext()) {
            ((zzflh) it.next()).zzg().zzk(z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmb
    public final boolean zzc() {
        Iterator it = zzflz.zza().zzb().iterator();
        while (it.hasNext()) {
            View viewZzf = ((zzflh) it.next()).zzf();
            if (viewZzf != null && viewZzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}

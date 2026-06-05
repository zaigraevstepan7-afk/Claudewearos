package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeda {
    private n6.b zza;
    private final Context zzb;

    public zzeda(Context context) {
        this.zzb = context;
    }

    public final mf.a zza() {
        try {
            n6.a aVarA = n6.b.a(this.zzb);
            this.zza = aVarA;
            return aVarA == null ? zzgdb.zzg(new IllegalStateException("MeasurementManagerFutures is null")) : aVarA.d();
        } catch (Exception e10) {
            return zzgdb.zzg(e10);
        }
    }

    public final mf.a zzb(Uri uri, InputEvent inputEvent) {
        try {
            n6.b bVar = this.zza;
            Objects.requireNonNull(bVar);
            return bVar.b(uri, inputEvent);
        } catch (Exception e10) {
            return zzgdb.zzg(e10);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgnn {
    public static final zzgws zza = zzgws.zzb(new byte[0]);

    public static final zzgws zza(int i10) {
        return zzgws.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final zzgws zzb(int i10) {
        return zzgws.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzapb implements zzapa {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzapb(FileChannel fileChannel, long j, long j4) {
        this.zza = fileChannel;
        this.zzb = j;
        this.zzc = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zzb(MessageDigest[] messageDigestArr, long j, int i10) throws IOException {
        MappedByteBuffer map = this.zza.map(FileChannel.MapMode.READ_ONLY, this.zzb + j, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzhfg extends zzhfj implements zzaro {
    protected final String zza = "moov";

    public zzhfg(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaro
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaro
    public final void zzb(zzhfk zzhfkVar, ByteBuffer byteBuffer, long j, zzarl zzarlVar) {
        zzhfkVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzhfkVar;
        this.zze = zzhfkVar.zzb();
        zzhfkVar.zze(zzhfkVar.zzb() + j);
        this.zzf = zzhfkVar.zzb();
        this.zzb = zzarlVar;
    }
}

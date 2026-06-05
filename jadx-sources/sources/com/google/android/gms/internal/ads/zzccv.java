package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzccv {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzarr zzarrVar;
        zzarq zzarqVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new zzarm(new zzccu(byteBufferDuplicate), zzccy.zzb).zzd().iterator();
            while (true) {
                zzarrVar = null;
                if (!it.hasNext()) {
                    zzarqVar = null;
                    break;
                }
                zzaro zzaroVar = (zzaro) it.next();
                if (zzaroVar instanceof zzarq) {
                    zzarqVar = (zzarq) zzaroVar;
                    break;
                }
            }
            Iterator it2 = zzarqVar.zzd().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzaro zzaroVar2 = (zzaro) it2.next();
                if (zzaroVar2 instanceof zzarr) {
                    zzarrVar = (zzarr) zzaroVar2;
                    break;
                }
            }
            long jZzc = (zzarrVar.zzc() * 1000) / zzarrVar.zzd();
            this.zza = jZzc;
            return jZzc;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}

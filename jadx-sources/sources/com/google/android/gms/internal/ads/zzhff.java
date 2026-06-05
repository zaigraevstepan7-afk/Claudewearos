package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzhff implements zzaro {
    private static final zzhfq zzg = zzhfq.zzb(zzhff.class);
    protected final String zza;
    long zzd;
    zzhfk zzf;
    private ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    public zzhff(String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        try {
            if (this.zzc) {
                return;
            }
            try {
                zzhfq zzhfqVar = zzg;
                String str = this.zza;
                zzhfqVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.zzh = this.zzf.zzd(this.zzd, this.zze);
                this.zzc = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaro
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaro
    public final void zzb(zzhfk zzhfkVar, ByteBuffer byteBuffer, long j, zzarl zzarlVar) {
        this.zzd = zzhfkVar.zzb();
        byteBuffer.remaining();
        this.zze = j;
        this.zzf = zzhfkVar;
        zzhfkVar.zze(zzhfkVar.zzb() + j);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    public abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        try {
            zzc();
            zzhfq zzhfqVar = zzg;
            String str = this.zza;
            zzhfqVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.zzh;
            if (byteBuffer != null) {
                this.zzb = true;
                byteBuffer.rewind();
                zze(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.zzh = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

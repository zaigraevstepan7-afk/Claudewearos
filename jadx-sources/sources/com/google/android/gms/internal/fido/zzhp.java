package com.google.android.gms.internal.fido;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import y8.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzhp implements Comparable {
    private final zzhp zzc(Class cls) throws zzho {
        if (cls.isInstance(this)) {
            return (zzhp) cls.cast(this);
        }
        throw new zzho(f.b("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public static int zzd(byte b10) {
        return (b10 >> 5) & 7;
    }

    public static zzhk zzg(long j) {
        return new zzhk(j);
    }

    public static zzhn zzi(String str) {
        return new zzhn(str);
    }

    public static zzhp zzj(byte... bArr) {
        bArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length));
        return zzhq.zza(byteArrayInputStream, new zzhs(byteArrayInputStream));
    }

    public static zzhp zzk(InputStream inputStream) {
        return zzhq.zza(inputStream, new zzhs(inputStream));
    }

    public abstract int zza();

    public int zzb() {
        return 0;
    }

    public final zzhi zze() {
        return (zzhi) zzc(zzhi.class);
    }

    public final zzhk zzf() {
        return (zzhk) zzc(zzhk.class);
    }

    public final zzhm zzh() {
        return (zzhm) zzc(zzhm.class);
    }
}

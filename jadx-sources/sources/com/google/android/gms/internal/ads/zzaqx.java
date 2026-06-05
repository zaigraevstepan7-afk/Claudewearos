package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaqx implements zzapl {
    private final zzaqw zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzaqx(zzaqw zzaqwVar, int i10) {
        this.zzc = zzaqwVar;
    }

    public static int zze(InputStream inputStream) {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    public static long zzf(InputStream inputStream) {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((zzn(inputStream) & 255) << 56);
    }

    public static String zzh(zzaqv zzaqvVar) {
        return new String(zzm(zzaqvVar, zzf(zzaqvVar)), "UTF-8");
    }

    public static void zzj(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    public static void zzk(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static byte[] zzm(zzaqv zzaqvVar, long j) throws IOException {
        long jZza = zzaqvVar.zza();
        if (j >= 0 && j <= jZza) {
            int i10 = (int) j;
            if (i10 == j) {
                byte[] bArr = new byte[i10];
                new DataInputStream(zzaqvVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbL = m1.l("streamToBytes length=", ", maxLength=", j);
        sbL.append(jZza);
        throw new IOException(sbL.toString());
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return i10;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzaqu zzaquVar) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb = (zzaquVar.zza - ((zzaqu) map.get(str)).zza) + this.zzb;
        } else {
            this.zzb += zzaquVar.zza;
        }
        map.put(str, zzaquVar);
    }

    private final void zzp(String str) {
        zzaqu zzaquVar = (zzaqu) this.zza.remove(str);
        if (zzaquVar != null) {
            this.zzb -= zzaquVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final synchronized zzapk zza(String str) {
        zzaqu zzaquVar = (zzaqu) this.zza.get(str);
        if (zzaquVar == null) {
            return null;
        }
        File fileZzg = zzg(str);
        try {
            zzaqv zzaqvVar = new zzaqv(new BufferedInputStream(new FileInputStream(fileZzg)), fileZzg.length());
            try {
                String str2 = zzaqu.zza(zzaqvVar).zzb;
                if (!TextUtils.equals(str, str2)) {
                    zzaqn.zza("%s: key=%s, found=%s", fileZzg.getAbsolutePath(), str, str2);
                    zzp(str);
                    return null;
                }
                byte[] bArrZzm = zzm(zzaqvVar, zzaqvVar.zza());
                zzapk zzapkVar = new zzapk();
                zzapkVar.zza = bArrZzm;
                zzapkVar.zzb = zzaquVar.zzc;
                zzapkVar.zzc = zzaquVar.zzd;
                zzapkVar.zzd = zzaquVar.zze;
                zzapkVar.zze = zzaquVar.zzf;
                zzapkVar.zzf = zzaquVar.zzg;
                List<zzapt> list = zzaquVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzapt zzaptVar : list) {
                    treeMap.put(zzaptVar.zza(), zzaptVar.zzb());
                }
                zzapkVar.zzg = treeMap;
                zzapkVar.zzh = Collections.unmodifiableList(list);
                return zzapkVar;
            } finally {
                zzaqvVar.close();
            }
        } catch (IOException e10) {
            zzaqn.zza("%s: %s", fileZzg.getAbsolutePath(), e10.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final synchronized void zzb() {
        File fileZza = this.zzc.zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        zzaqv zzaqvVar = new zzaqv(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzaqu zzaquVarZza = zzaqu.zza(zzaqvVar);
                            zzaquVarZza.zza = length;
                            zzo(zzaquVarZza.zzb, zzaquVarZza);
                            zzaqvVar.close();
                        } catch (Throwable th2) {
                            zzaqvVar.close();
                            throw th2;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            zzaqn.zzb("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final synchronized void zzc(String str, boolean z2) {
        zzapk zzapkVarZza = zza(str);
        if (zzapkVarZza != null) {
            zzapkVarZza.zzf = 0L;
            zzapkVarZza.zze = 0L;
            zzd(str, zzapkVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final synchronized void zzd(String str, zzapk zzapkVar) {
        float f10;
        try {
            long j = this.zzb;
            int length = zzapkVar.zza.length;
            long j4 = j + length;
            int i10 = this.zzd;
            float f11 = 0.9f;
            if (j4 <= i10 || length <= i10 * 0.9f) {
                File fileZzg = zzg(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzg));
                    zzaqu zzaquVar = new zzaqu(str, zzapkVar);
                    try {
                        zzj(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzaquVar.zzb);
                        String str2 = zzaquVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzk(bufferedOutputStream, zzaquVar.zzd);
                        zzk(bufferedOutputStream, zzaquVar.zze);
                        zzk(bufferedOutputStream, zzaquVar.zzf);
                        zzk(bufferedOutputStream, zzaquVar.zzg);
                        List<zzapt> list = zzaquVar.zzh;
                        if (list != null) {
                            zzj(bufferedOutputStream, list.size());
                            for (zzapt zzaptVar : list) {
                                zzl(bufferedOutputStream, zzaptVar.zza());
                                zzl(bufferedOutputStream, zzaptVar.zzb());
                            }
                        } else {
                            zzj(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzapkVar.zza);
                        bufferedOutputStream.close();
                        zzaquVar.zza = fileZzg.length();
                        zzo(str, zzaquVar);
                        long j10 = this.zzb;
                        int i11 = this.zzd;
                        if (j10 >= i11) {
                            boolean z2 = zzaqn.zzb;
                            if (z2) {
                                zzaqn.zzd("Pruning old cache entries.", new Object[0]);
                            }
                            long j11 = this.zzb;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i12 = 0;
                            while (it.hasNext()) {
                                zzaqu zzaquVar2 = (zzaqu) ((Map.Entry) it.next()).getValue();
                                String str3 = zzaquVar2.zzb;
                                if (zzg(str3).delete()) {
                                    f10 = f11;
                                    this.zzb -= zzaquVar2.zza;
                                } else {
                                    f10 = f11;
                                    zzaqn.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                                }
                                it.remove();
                                i12++;
                                if (this.zzb < i11 * f10) {
                                    break;
                                } else {
                                    f11 = f10;
                                }
                            }
                            if (z2) {
                                zzaqn.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i12), Long.valueOf(this.zzb - j11), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e10) {
                        zzaqn.zza("%s", e10.toString());
                        bufferedOutputStream.close();
                        zzaqn.zza("Failed to write header for %s", fileZzg.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileZzg.delete()) {
                        zzaqn.zza("Could not clean up file %s", fileZzg.getAbsolutePath());
                    }
                    if (!this.zzc.zza().exists()) {
                        zzaqn.zza("Re-initializing cache after external clearing.", new Object[0]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzb();
                    }
                }
            }
        } finally {
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean zDelete = zzg(str).delete();
        zzp(str);
        if (zDelete) {
            return;
        }
        zzaqn.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public zzaqx(File file, int i10) {
        this.zzc = new zzaqt(this, file);
    }
}

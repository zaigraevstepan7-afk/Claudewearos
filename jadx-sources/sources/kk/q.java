package kk;

import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class q extends k {
    @Override // kk.k
    public b4.e b(t tVar) {
        fj.l.f(tVar, "path");
        File file = tVar.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new b4.e(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // kk.k
    public final p e(t tVar) {
        return new p(new RandomAccessFile(tVar.toFile(), "r"));
    }

    @Override // kk.k
    public final c0 g(t tVar) {
        fj.l.f(tVar, "file");
        return new d(new FileInputStream(tVar.toFile()), e0.f9690d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}

package g7;

import android.database.sqlite.SQLiteProgram;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class h implements f7.f {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f7251a;

    public h(SQLiteProgram sQLiteProgram) {
        l.f(sQLiteProgram, "delegate");
        this.f7251a = sQLiteProgram;
    }

    @Override // f7.f
    public final void E(int i10, byte[] bArr) {
        this.f7251a.bindBlob(i10, bArr);
    }

    @Override // f7.f
    public final void R(int i10) {
        this.f7251a.bindNull(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7251a.close();
    }

    @Override // f7.f
    public final void d() {
        this.f7251a.clearBindings();
    }

    @Override // f7.f
    public final void k(int i10, String str) {
        l.f(str, "value");
        this.f7251a.bindString(i10, str);
    }

    @Override // f7.f
    public final void o(int i10, double d10) {
        this.f7251a.bindDouble(i10, d10);
    }

    @Override // f7.f
    public final void v(int i10, long j) {
        this.f7251a.bindLong(i10, j);
    }
}

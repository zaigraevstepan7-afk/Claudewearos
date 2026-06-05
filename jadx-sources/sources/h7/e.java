package h7;

import android.database.Cursor;
import fj.l;
import p7.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends f {
    public byte[][] A;
    public Cursor B;

    /* renamed from: d, reason: collision with root package name */
    public int[] f7679d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f7680e;

    /* renamed from: f, reason: collision with root package name */
    public double[] f7681f;

    /* renamed from: z, reason: collision with root package name */
    public String[] f7682z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f7.b bVar, String str) {
        super(bVar, str);
        l.f(bVar, "db");
        l.f(str, "sql");
        this.f7679d = new int[0];
        this.f7680e = new long[0];
        this.f7681f = new double[0];
        this.f7682z = new String[0];
        this.A = new byte[0][];
    }

    public static void g(Cursor cursor, int i10) {
        if (i10 < 0 || i10 >= cursor.getColumnCount()) {
            uk.c.S(25, "column index out of range");
            throw null;
        }
    }

    @Override // e7.c
    public final String M(int i10) {
        b();
        Cursor cursor = this.B;
        if (cursor == null) {
            uk.c.S(21, "no row");
            throw null;
        }
        g(cursor, i10);
        String string = cursor.getString(i10);
        l.e(string, "getString(...)");
        return string;
    }

    @Override // e7.c
    public final boolean a0() {
        b();
        e();
        Cursor cursor = this.B;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f7685c) {
            d();
            reset();
        }
        this.f7685c = true;
    }

    @Override // h7.f, e7.c
    public final void d() {
        b();
        this.f7679d = new int[0];
        this.f7680e = new long[0];
        this.f7681f = new double[0];
        this.f7682z = new String[0];
        this.A = new byte[0][];
    }

    public final void e() {
        if (this.B == null) {
            this.B = this.f7683a.r(new k(this, 9));
        }
    }

    @Override // e7.c
    public final int getColumnCount() {
        b();
        e();
        Cursor cursor = this.B;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // e7.c
    public final String getColumnName(int i10) {
        b();
        e();
        Cursor cursor = this.B;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        g(cursor, i10);
        String columnName = cursor.getColumnName(i10);
        l.e(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // e7.c
    public final long getLong(int i10) {
        b();
        Cursor cursor = this.B;
        if (cursor != null) {
            g(cursor, i10);
            return cursor.getLong(i10);
        }
        uk.c.S(21, "no row");
        throw null;
    }

    @Override // e7.c
    public final boolean isNull(int i10) {
        b();
        Cursor cursor = this.B;
        if (cursor != null) {
            g(cursor, i10);
            return cursor.isNull(i10);
        }
        uk.c.S(21, "no row");
        throw null;
    }

    @Override // h7.f, e7.c
    public final void reset() {
        b();
        Cursor cursor = this.B;
        if (cursor != null) {
            cursor.close();
        }
        this.B = null;
    }
}

package g7;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import fj.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements f7.b {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f7224b = new String[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f7225c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f7226d;

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f7227a;

    static {
        pi.f fVar = pi.f.f12997a;
        f7225c = v.P(fVar, new fa.a(8));
        f7226d = v.P(fVar, new fa.a(9));
    }

    public b(SQLiteDatabase sQLiteDatabase) {
        this.f7227a = sQLiteDatabase;
    }

    @Override // f7.b
    public final void B() {
        this.f7227a.beginTransactionNonExclusive();
    }

    @Override // f7.b
    public final void K() {
        this.f7227a.endTransaction();
    }

    @Override // f7.b
    public final boolean X() {
        return this.f7227a.isWriteAheadLoggingEnabled();
    }

    @Override // f7.b
    public final boolean c() {
        return this.f7227a.inTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7227a.close();
    }

    @Override // f7.b
    public final void f() {
        this.f7227a.beginTransaction();
    }

    @Override // f7.b
    public final void i() {
        this.f7227a.disableWriteAheadLogging();
    }

    @Override // f7.b
    public final boolean isOpen() {
        return this.f7227a.isOpen();
    }

    @Override // f7.b
    public final void j(String str) {
        l.f(str, "sql");
        this.f7227a.execSQL(str);
    }

    @Override // f7.b
    public final i m(String str) throws SQLException {
        l.f(str, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f7227a.compileStatement(str);
        l.e(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new i(sQLiteStatementCompileStatement);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, pi.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, pi.e] */
    @Override // f7.b
    public final void p() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ?? r12 = f7226d;
        if (((Method) r12.getValue()) != null) {
            ?? r2 = f7225c;
            if (((Method) r2.getValue()) != null) {
                Method method = (Method) r12.getValue();
                l.c(method);
                Method method2 = (Method) r2.getValue();
                l.c(method2);
                Object objInvoke = method2.invoke(this.f7227a, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(objInvoke, 0, null, 0, null);
                return;
            }
        }
        f();
    }

    @Override // f7.b
    public final Cursor r(f7.g gVar) {
        final d0.g gVar2 = new d0.g(gVar, 1);
        Cursor cursorRawQueryWithFactory = this.f7227a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: g7.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) gVar2.e(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, gVar.b(), f7224b, null);
        l.e(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // f7.b
    public final boolean w() {
        return this.f7227a.enableWriteAheadLogging();
    }

    @Override // f7.b
    public final void y(Object[] objArr) throws SQLException {
        this.f7227a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // f7.b
    public final void z() {
        this.f7227a.setTransactionSuccessful();
    }
}

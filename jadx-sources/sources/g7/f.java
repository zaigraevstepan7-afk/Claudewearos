package g7;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import fj.l;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p7.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends SQLiteOpenHelper {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f7238z = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f7239a;

    /* renamed from: b, reason: collision with root package name */
    public final k f7240b;

    /* renamed from: c, reason: collision with root package name */
    public final f7.c f7241c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7242d;

    /* renamed from: e, reason: collision with root package name */
    public final i7.a f7243e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7244f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String str, final k kVar, final f7.c cVar) {
        String string;
        super(context, str, null, cVar.f6650a, new DatabaseErrorHandler() { // from class: g7.c
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i10 = f.f7238z;
                l.c(sQLiteDatabase);
                b bVarI = a.a.I(kVar, sQLiteDatabase);
                cVar.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVarI + ".path");
                SQLiteDatabase sQLiteDatabase2 = bVarI.f7227a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        f7.c.a(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                l.e(obj, "second");
                                f7.c.a((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                f7.c.a(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    bVarI.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        l.f(context, "context");
        l.f(cVar, "callback");
        this.f7239a = context;
        this.f7240b = kVar;
        this.f7241c = cVar;
        if (str == null) {
            string = UUID.randomUUID().toString();
            l.e(string, "toString(...)");
        } else {
            string = str;
        }
        this.f7243e = new i7.a(string, context.getCacheDir(), false);
    }

    public final f7.b b(boolean z2) throws IOException {
        i7.a aVar = this.f7243e;
        try {
            aVar.a((this.f7244f || getDatabaseName() == null) ? false : true);
            this.f7242d = false;
            SQLiteDatabase sQLiteDatabaseE = e(z2);
            if (!this.f7242d) {
                b bVarI = a.a.I(this.f7240b, sQLiteDatabaseE);
                aVar.b();
                return bVarI;
            }
            close();
            f7.b bVarB = b(z2);
            aVar.b();
            return bVarB;
        } catch (Throwable th2) {
            aVar.b();
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        i7.a aVar = this.f7243e;
        try {
            aVar.a(aVar.f8362a);
            super.close();
            this.f7240b.f12813b = null;
            this.f7244f = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase e(boolean z2) throws Throwable {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z10 = this.f7244f;
        if (databaseName != null && !z10 && (parentFile = this.f7239a.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z2) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                l.c(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            l.c(readableDatabase2);
            return readableDatabase2;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z2) {
                    readableDatabase = getWritableDatabase();
                    l.c(readableDatabase);
                } else {
                    readableDatabase = getReadableDatabase();
                    l.c(readableDatabase);
                }
                return readableDatabase;
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof d) {
                    d dVar = (d) th;
                    int iOrdinal = dVar.f7230a.ordinal();
                    th = dVar.f7231b;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        throw new b3.e();
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        l.f(sQLiteDatabase, "db");
        boolean z2 = this.f7242d;
        f7.c cVar = this.f7241c;
        if (!z2 && cVar.f6650a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            cVar.g(a.a.I(this.f7240b, sQLiteDatabase));
        } catch (Throwable th2) {
            throw new d(e.f7232a, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        l.f(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f7241c.h(a.a.I(this.f7240b, sQLiteDatabase));
        } catch (Throwable th2) {
            throw new d(e.f7233b, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        l.f(sQLiteDatabase, "db");
        this.f7242d = true;
        try {
            this.f7241c.i(a.a.I(this.f7240b, sQLiteDatabase), i10, i11);
        } catch (Throwable th2) {
            throw new d(e.f7235d, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        l.f(sQLiteDatabase, "db");
        if (!this.f7242d) {
            try {
                this.f7241c.j(a.a.I(this.f7240b, sQLiteDatabase));
            } catch (Throwable th2) {
                throw new d(e.f7236e, th2);
            }
        }
        this.f7244f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        l.f(sQLiteDatabase, "sqLiteDatabase");
        this.f7242d = true;
        try {
            this.f7241c.k(a.a.I(this.f7240b, sQLiteDatabase), i10, i11);
        } catch (Throwable th2) {
            throw new d(e.f7234c, th2);
        }
    }
}

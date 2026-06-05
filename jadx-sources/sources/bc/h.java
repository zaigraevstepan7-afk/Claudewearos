package bc;

import ac.m;
import ai.n;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements d, cc.c, c {

    /* renamed from: f, reason: collision with root package name */
    public static final rb.c f1735f = new rb.c("proto");

    /* renamed from: a, reason: collision with root package name */
    public final j f1736a;

    /* renamed from: b, reason: collision with root package name */
    public final dc.a f1737b;

    /* renamed from: c, reason: collision with root package name */
    public final dc.a f1738c;

    /* renamed from: d, reason: collision with root package name */
    public final a f1739d;

    /* renamed from: e, reason: collision with root package name */
    public final oi.a f1740e;

    public h(dc.a aVar, dc.a aVar2, a aVar3, j jVar, oi.a aVar4) {
        this.f1736a = jVar;
        this.f1737b = aVar;
        this.f1738c = aVar2;
        this.f1739d = aVar3;
        this.f1740e = aVar4;
    }

    public static Object C(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long e(SQLiteDatabase sQLiteDatabase, ub.i iVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f16961a, String.valueOf(ec.a.a(iVar.f16963c))));
        byte[] bArr = iVar.f16962b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String t(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f1728a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public final SQLiteDatabase b() {
        j jVar = this.f1736a;
        Objects.requireNonNull(jVar);
        dc.a aVar = this.f1738c;
        long jA = aVar.a();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.a() >= this.f1739d.f1725c + jA) {
                    throw new cc.a("Timed out while trying to open db.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1736a.close();
    }

    public final Object g(f fVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        sQLiteDatabaseB.beginTransaction();
        try {
            Object objApply = fVar.apply(sQLiteDatabaseB);
            sQLiteDatabaseB.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    public final ArrayList l(SQLiteDatabase sQLiteDatabase, ub.i iVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long lE = e(sQLiteDatabase, iVar);
        if (lE == null) {
            return arrayList;
        }
        C(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lE.toString()}, null, null, null, String.valueOf(i10)), new n(this, arrayList, iVar, 1));
        return arrayList;
    }

    public final void n(long j, xb.c cVar, String str) {
        g(new m(str, j, cVar));
    }

    public final Object s(cc.b bVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        dc.a aVar = this.f1738c;
        long jA = aVar.a();
        while (true) {
            try {
                sQLiteDatabaseB.beginTransaction();
                try {
                    Object objC = bVar.c();
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return objC;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.a() >= this.f1739d.f1725c + jA) {
                    throw new cc.a("Timed out while trying to acquire the lock.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}

package u6;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y extends f7.c {

    /* renamed from: b, reason: collision with root package name */
    public a f16801b;

    /* renamed from: c, reason: collision with root package name */
    public final List f16802c;

    /* renamed from: d, reason: collision with root package name */
    public final d8.e f16803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a aVar, d8.e eVar) {
        super(12);
        fj.l.f(aVar, "configuration");
        this.f16802c = aVar.f16665e;
        this.f16801b = aVar;
        this.f16803d = eVar;
    }

    @Override // f7.c
    public final void h(g7.b bVar) throws IOException {
        Cursor cursorR = bVar.r(new f7.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            boolean z2 = false;
            if (cursorR.moveToFirst()) {
                if (cursorR.getInt(0) == 0) {
                    z2 = true;
                }
            }
            cursorR.close();
            d8.e.m(bVar);
            if (!z2) {
                x xVarA = d8.e.A(bVar);
                if (!xVarA.f16799a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + xVarA.f16800b);
                }
            }
            bVar.j("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.j("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
            int i10 = WorkDatabase_Impl.f1236t;
            List list = this.f16802c;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((r) it.next()).getClass();
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                v.n(cursorR, th2);
                throw th3;
            }
        }
    }

    @Override // f7.c
    public final void i(g7.b bVar, int i10, int i11) throws Exception {
        k(bVar, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // f7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(g7.b r5) throws java.lang.Exception {
        /*
            r4 = this;
            f7.a r0 = new f7.a
            java.lang.String r1 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            r0.<init>(r1)
            android.database.Cursor r0 = r5.r(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            if (r1 == 0) goto L1d
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1d
            r1 = 1
            goto L1e
        L1a:
            r5 = move-exception
            goto Lbb
        L1d:
            r1 = r2
        L1e:
            r0.close()
            r0 = 0
            if (r1 == 0) goto L63
            f7.a r1 = new f7.a
            java.lang.String r3 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r3)
            android.database.Cursor r1 = r5.r(r1)
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L3c
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L3a
            goto L3d
        L3a:
            r5 = move-exception
            goto L5d
        L3c:
            r2 = r0
        L3d:
            r1.close()
            java.lang.String r1 = "c103703e120ae8cc73c9248622f3cd1e"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L75
            java.lang.String r1 = "49f946663a8deb7054212b8adda248c6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L51
            goto L75
        L51:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: c103703e120ae8cc73c9248622f3cd1e, found: "
            java.lang.String r0 = t.m1.i(r0, r2)
            r5.<init>(r0)
            throw r5
        L5d:
            throw r5     // Catch: java.lang.Throwable -> L5e
        L5e:
            r0 = move-exception
            u6.v.n(r1, r5)
            throw r0
        L63:
            u6.x r1 = d8.e.A(r5)
            boolean r2 = r1.f16799a
            if (r2 == 0) goto La5
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r5.j(r1)
            java.lang.String r1 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')"
            r5.j(r1)
        L75:
            d8.e r1 = r4.f16803d
            java.lang.Object r1 = r1.f5001a
            androidx.work.impl.WorkDatabase_Impl r1 = (androidx.work.impl.WorkDatabase_Impl) r1
            int r2 = androidx.work.impl.WorkDatabase_Impl.f1236t
            java.lang.String r2 = "PRAGMA foreign_keys = ON"
            r5.j(r2)
            h7.a r2 = new h7.a
            r2.<init>(r5)
            r1.o(r2)
            java.util.List r1 = r4.f16802c
            if (r1 == 0) goto La2
            java.util.Iterator r1 = r1.iterator()
        L92:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La2
            java.lang.Object r2 = r1.next()
            u6.r r2 = (u6.r) r2
            r2.a(r5)
            goto L92
        La2:
            r4.f16801b = r0
            return
        La5:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.String r1 = r1.f16800b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        Lbb:
            throw r5     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r1 = move-exception
            u6.v.n(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.y.j(g7.b):void");
    }

    @Override // f7.c
    public final void k(g7.b bVar, int i10, int i11) throws Exception {
        a aVar = this.f16801b;
        if (aVar != null) {
            ag.i iVar = aVar.f16664d;
            iVar.getClass();
            List<x6.a> listM = u1.b.m(iVar, i10, i11);
            if (listM != null) {
                u0.l.f(new h7.a(bVar));
                for (x6.a aVar2 : listM) {
                    aVar2.getClass();
                    aVar2.a(bVar);
                }
                x xVarA = d8.e.A(bVar);
                if (!xVarA.f16799a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + xVarA.f16800b);
                }
                bVar.j("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.j("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
                return;
            }
        }
        a aVar3 = this.f16801b;
        if (aVar3 == null || u1.b.r(aVar3, i10, i11)) {
            throw new IllegalStateException(m6.a.f("A migration from ", i10, " to ", i11, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        if (aVar3.f16678s) {
            Cursor cursorR = bVar.r(new f7.a("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"));
            try {
                ri.c cVarR = yd.f.r();
                while (cursorR.moveToNext()) {
                    String string = cursorR.getString(0);
                    fj.l.c(string);
                    if (!nj.l.A0(string, "sqlite_") && !string.equals("android_metadata")) {
                        cVarR.add(new pi.h(string, Boolean.valueOf(fj.l.b(cursorR.getString(1), "view"))));
                    }
                }
                ri.c cVarM = yd.f.m(cVarR);
                cursorR.close();
                ListIterator listIterator = cVarM.listIterator(0);
                while (true) {
                    ri.a aVar4 = (ri.a) listIterator;
                    if (!aVar4.hasNext()) {
                        break;
                    }
                    pi.h hVar = (pi.h) aVar4.next();
                    String str = (String) hVar.f13000a;
                    if (((Boolean) hVar.f13001b).booleanValue()) {
                        bVar.j("DROP VIEW IF EXISTS " + str);
                    } else {
                        bVar.j("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            bVar.j("DROP TABLE IF EXISTS `Dependency`");
            bVar.j("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.j("DROP TABLE IF EXISTS `WorkTag`");
            bVar.j("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.j("DROP TABLE IF EXISTS `WorkName`");
            bVar.j("DROP TABLE IF EXISTS `WorkProgress`");
            bVar.j("DROP TABLE IF EXISTS `Preference`");
            int i12 = WorkDatabase_Impl.f1236t;
        }
        List list = this.f16802c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((r) it.next()).getClass();
            }
        }
        d8.e.m(bVar);
    }

    @Override // f7.c
    public final void g(g7.b bVar) {
    }
}

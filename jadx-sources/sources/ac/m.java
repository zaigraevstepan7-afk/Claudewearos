package ac;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements cc.b, Continuation, bc.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f405c;

    public /* synthetic */ m(ai.j jVar, long j, HashMap map) {
        this.f404b = jVar;
        this.f403a = j;
        this.f405c = map;
    }

    @Override // bc.f
    public Object apply(Object obj) throws SQLException {
        String str = (String) this.f404b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((xb.c) this.f405c).f19879a;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            boolean z2 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f403a;
            if (z2) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i10));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    @Override // cc.b
    public Object c() {
        n nVar = (n) this.f404b;
        ub.i iVar = (ub.i) this.f405c;
        bc.d dVar = (bc.d) nVar.f408c;
        long jA = ((dc.a) nVar.f412g).a() + this.f403a;
        bc.h hVar = (bc.h) dVar;
        hVar.getClass();
        hVar.g(new bc.e(jA, iVar));
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((ai.j) this.f404b).b(task, this.f403a, (HashMap) this.f405c);
    }

    public /* synthetic */ m(Object obj, long j, Object obj2) {
        this.f404b = obj;
        this.f405c = obj2;
        this.f403a = j;
    }
}

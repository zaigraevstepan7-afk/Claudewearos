package bc;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.OnFailureListener;
import p1.l;
import pg.q;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements f, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f1731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1732b;

    public /* synthetic */ e(long j, ub.i iVar) {
        this.f1731a = j;
        this.f1732b = iVar;
    }

    @Override // bc.f
    public Object apply(Object obj) {
        ub.i iVar = (ub.i) this.f1732b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f1731a));
        String str = iVar.f16961a;
        rb.d dVar = iVar.f16963c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(ec.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f16961a);
            contentValues.put("priority", Integer.valueOf(ec.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        q qVar = (q) this.f1732b;
        l lVar = qVar.f12948y;
        if (this.f1731a != qVar.B) {
            lVar.l(null, "Ignoring getToken error, because this was not the latest attempt.", new Object[0]);
            return;
        }
        qVar.f12932h = pg.l.f12906a;
        lVar.l(null, "Error fetching token: " + exc, new Object[0]);
        qVar.o();
    }

    public /* synthetic */ e(q qVar, long j) {
        this.f1732b = qVar;
        this.f1731a = j;
    }
}

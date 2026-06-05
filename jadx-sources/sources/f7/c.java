package f7;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import fj.l;
import java.io.File;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f6650a;

    public static void a(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z2 = false;
        while (i10 <= length) {
            boolean z10 = l.h(str.charAt(!z2 ? i10 : length), 32) <= 0;
            if (z2) {
                if (!z10) {
                    break;
                } else {
                    length--;
                }
            } else if (z10) {
                i10++;
            } else {
                z2 = true;
            }
        }
        if (str.subSequence(i10, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e10) {
            Log.w("SupportSQLite", "delete failed: ", e10);
        }
    }

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract void h(g7.b bVar);

    public abstract void i(g7.b bVar, int i10, int i11);

    public abstract void j(g7.b bVar);

    public abstract void k(g7.b bVar, int i10, int i11);

    public void g(g7.b bVar) {
    }
}

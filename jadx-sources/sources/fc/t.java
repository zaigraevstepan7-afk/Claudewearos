package fc;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import nc.i2;
import nc.u3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f6712a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6713b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final j f6714c;

    public t(i2 i2Var) {
        this.f6712a = i2Var;
        if (i2Var != null) {
            try {
                List<u3> listZzj = i2Var.zzj();
                if (listZzj != null) {
                    for (u3 u3Var : listZzj) {
                        j jVar = u3Var != null ? new j(u3Var) : null;
                        if (jVar != null) {
                            this.f6713b.add(jVar);
                        }
                    }
                }
            } catch (RemoteException e10) {
                rc.k.e("Could not forward getAdapterResponseInfo to ResponseInfo.", e10);
            }
        }
        i2 i2Var2 = this.f6712a;
        if (i2Var2 == null) {
            return;
        }
        try {
            u3 u3VarZzf = i2Var2.zzf();
            if (u3VarZzf != null) {
                this.f6714c = new j(u3VarZzf);
            }
        } catch (RemoteException e11) {
            rc.k.e("Could not forward getLoadedAdapterResponse to ResponseInfo.", e11);
        }
    }

    public final JSONObject a() throws JSONException {
        String strZzi;
        Bundle bundleZze;
        JSONObject jSONObject = new JSONObject();
        String strZzg = null;
        i2 i2Var = this.f6712a;
        if (i2Var != null) {
            try {
                strZzi = i2Var.zzi();
            } catch (RemoteException e10) {
                rc.k.e("Could not forward getResponseId to ResponseInfo.", e10);
            }
        } else {
            strZzi = null;
        }
        if (strZzi == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strZzi);
        }
        if (i2Var != null) {
            try {
                strZzg = i2Var.zzg();
            } catch (RemoteException e11) {
                rc.k.e("Could not forward getMediationAdapterClassName to ResponseInfo.", e11);
            }
        }
        if (strZzg == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strZzg);
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.f6713b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            jSONArray.put(((j) obj).a());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        j jVar = this.f6714c;
        if (jVar != null) {
            jSONObject.put("Loaded Adapter Response", jVar.a());
        }
        if (i2Var != null) {
            try {
                bundleZze = i2Var.zze();
            } catch (RemoteException e12) {
                rc.k.e("Could not forward getResponseExtras to ResponseInfo.", e12);
            }
        } else {
            bundleZze = new Bundle();
        }
        if (bundleZze != null) {
            jSONObject.put("Response Extras", nc.s.f12202f.f12203a.j(bundleZze));
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}

package insper.bet.account;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AccountController {
    
    @PostMapping("/accounts")
    public ResponseEntity<AccountOut> create(@RequestBody(required = true) AccountIn accountIn);

    @PostMapping("/accounts/{id}")
    public ResponseEntity<AccountOut> update(@PathVariable(required = true) String id,@RequestBody(required = true) AccountIn accountIn);
    
    public ResponseEntity<AccountOut> read(String id);
    
}
